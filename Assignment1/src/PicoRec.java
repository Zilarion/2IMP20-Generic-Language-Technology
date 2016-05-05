import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.HashSet;

/**
 * Created by ruudandriessen on 05/05/16.
 */
public class PicoRec {
    enum Token {
        BEGIN, BAR, END, DECLARE, MULT, MINUS, PLUS, SEMI, COMMA, PAR_OPEN, PAR_CLOSE, ID, NAT, ASSIGN, EOF
    }

    Token token;
    Reader reader;
    String stack;
    int pos;
    int next;
    boolean skip_read;
    LexiconPico lexicon;

    public static void main(String[] args) {
        // Check simple valid input
        test("./input/Empty.pico", true);
        test("./input/SingleDeclr.pico", true);
        test("./input/SingleStatement.pico", true);

        // Check complex valid input
        test("./input/MultiDeclr.pico", true);
        test("./input/MultiStatement.pico", true);
        test("./input/SimplePar.pico", true);
        test("./input/AssignToFromDeclr.pico", true);
        test("./input/ComplexStatements.pico", true);
        test("./input/WhiteSpaceComplexStatements.pico", true);

        // Check for invalid input
        test("./input/InvalidMultiDeclr.pico", false);
        test("./input/InvalidSecondDeclr.pico", false);
        test("./input/NoSemiColumn.pico", false);
        test("./input/MultiStatementInvalidAssign.pico", false);
        test("./input/InvalidOperators.pico", false);
    }

    public static void test(String file, boolean expected) {
        File f = new File(file);
        PicoRec parser = null;
        try {
            parser = new PicoRec(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean pass = false;
        try {
            pass = parser.run();
        } catch (ParseException e) {
        }
        System.out.println((pass == expected ? "Pass" : "Fail") + " --> Tested on " + f.getName());
    }


    public PicoRec(InputStream in) {
        reader = new InputStreamReader(in, Charset.defaultCharset());
        stack = "";
        pos = 0;
        skip_read = false;
        lexicon = new LexiconPico();
    }

    /**
     * Checks the given pico input
     * @return true if valid, throws exception otherwise
     */
    public boolean run() throws ParseException {
        nextToken();
        parse_pico();
        return true;
    }

    public void match(Token expected) throws ParseException {
        if (expected == token) {
            nextToken();
        } else {
            throw new ParseException("Expected  " + expected + " found " + token, pos);
        }
    }

    public void parse_pico() throws ParseException {
        switch (token) {
            case BEGIN:
                match(Token.BEGIN);
                parse_declarations();
                match(Token.BAR);
                parse_statement();
                match(Token.END);
                match(Token.EOF);
                break;
            default: throw new ParseException("Program did not start with begin", pos);
        }
    }

    public void parse_declarations() throws ParseException {
        switch (token) {
            case DECLARE:
                match(Token.DECLARE);
                parse_declaration_prime();
                break;
            default: throw new ParseException("Declaration token expected in declarations, found: " + token, pos);
        }
    }

    public void parse_declaration_prime() throws ParseException {
        switch (token) {
            case ID:
                match(Token.ID);
                match(Token.COMMA);
                parse_declaration_prime();
                break;
            default : // epsilon
        }
    }

    public void parse_statement() throws ParseException {
        switch (token) {
            case ID:
                parse_statement_prime();
                match(Token.SEMI);
                parse_statement();
                break;
            default: // epsilon
        }
    }

    public void parse_statement_prime() throws ParseException {
        switch (token) {
            case ID:
                match(Token.ID);
                match(Token.ASSIGN);
                parse_expression();
                break;
            default: throw new ParseException("Expected ID token in statement prime, found: " + token, pos);
        }
    }

    public void parse_lexp() throws ParseException {
        switch (token) {
            case MINUS:
                match(Token.MINUS);
                parse_expression();
                break;
            case ID:
                match(Token.ID);
                break;
            case NAT:
                match(Token.NAT);
                break;
            case PAR_OPEN:
                match(Token.PAR_OPEN);
                parse_expression();
                match(Token.PAR_CLOSE);
                break;
            default: throw new ParseException("Expected LEXP, found: " + token, pos);
        }
    }

    public void parse_expression() throws ParseException {
        parse_lexp();
        parse_mexp();
        parse_pexp();
    }

    public void parse_pexp() throws ParseException {
        switch (token) {
            case PLUS:
                match(Token.PLUS);
                parse_expression();
                parse_pexp();
                break;
            default: // epsilon
        }
    }

    public void parse_mexp() throws ParseException {
        switch (token) {
            case MULT:
                match(Token.MULT);
                parse_expression();
                parse_mexp();
                break;
            default: // epsilon
        }
    }

    public void nextToken() throws ParseException {
        boolean done = false;
        Token recallToken = null;

        while (!done) {
            // While we are not done, get the next character
            next();

            if (eof()) {
                if (recallToken == null) {
                    // If we found an eof, but did not find a valid token yet, we got an invalid input
                    token = Token.EOF;
                    done = true;
                } else {
                    // If we are at eof but found a valid token, we return this token
                    done = true;
                    token = recallToken;
                    stack = "";
                    skip_read = true;
                }
            }

            // Add the next character to the stack string if it's not whitespace/newline
            if (!iswhitespace()) {
                stack += (char) next;
            }

            // Classify our current stack
            HashSet<String> result = lexicon.classify(stack);

            if (result.isEmpty() && recallToken != null) {
                // If we get no results, but already found a valid token, we return this token
                done = true;
                token = recallToken;

                // Reset the stack to the character we could not match
                stack = "";
                skip_read = true;
            } else if (result.contains("BEGIN")) {
                done = true;
                token = Token.BEGIN;
                stack = "";
            } else if (result.contains("END")) {
                done = true;
                token = Token.END;
                stack = "";
            } else if (result.contains("DECLARE")) {
                done = true;
                token = Token.DECLARE;
                stack = "";
            } else if (result.size() == 1) {
                // If we found one result, we found a matching token and store it as recall token
                for (String s : result) {
                    String tokenString = s;
                    recallToken = Token.valueOf(tokenString);
                }
            }
        }
//        System.out.println("Result: " + token);
    }

    public boolean iswhitespace() {
        return next == ' ' || next == '\n';
    }

    public boolean eof() {
        return next == -1;
    }

    public void next() {
        if (skip_read) {
            skip_read = false;
            return;
        }
        try {
            pos ++;
            next = reader.read();
        } catch (IOException e) {
            e.printStackTrace();
            next = -1;
        }
    }
}
