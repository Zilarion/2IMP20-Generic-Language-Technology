import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.text.ParseException;

import static javafx.scene.input.KeyCode.BEGIN;
import static javax.swing.text.html.HTML.Attribute.DECLARE;

/**
 * Created by ruudandriessen on 05/05/16.
 */
public class PicoRecursive {
    enum State {
        START, DONE, ID, NAT, ASSIGN
    }
    enum Token {
        BEGIN, BAR, END, DECLARE, EOF, MULT, MINUS, PLUS, SEMI, COMMA, PAR_OPEN, PAR_CLOSE, ID, NAT, ASSIGN
    }

    State state;
    Token token;
    Reader reader;
    String stack;
    int pos;
    int next;
    boolean skip_read;

    public PicoRecursive(InputStream in) {
        reader = new InputStreamReader(in, Charset.defaultCharset());
        stack = "";
        state = State.START;
        pos = 0;
        skip_read = false;
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
            case ID:
                match(Token.ID);
                break;
            case NAT:
                match(Token.NAT);
                break;
            case PAR_OPEN:
                parse_expression();
                match(Token.PAR_CLOSE);
                break;
            case MINUS:
                parse_expression();
                break;
            default: throw new ParseException("Expected LEXP, found: " +token, pos);
        }
    }

    public void parse_expression() throws ParseException {
        parse_lexp();
        try {
            parse_pexp();
        } catch (ParseException e) {
            parse_mexp();
        }
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
        while (state != State.DONE) {
            next();
            switch(state) {
                case START:
                    processStart();
                    break;
                case ID:
                    processIdentifier();
                    break;
                case NAT:
                    processNat();
                    break;
                case ASSIGN:
                    processAssign();
                    break;
            }
        }
    }

    public void processStart() throws ParseException {
        if (next == -1) {
            state = State.DONE;
            token = Token.EOF;
        } else if(iswhitespace(next)) {
            // ok we'll skip this
        } else if (isletter(next)) {
            stack += (char) next;
            state = State.ID;
        } else if (isnumber(next)) {
            state = State.NAT;
        } else {
            char next_c = (char) next;
            switch (next_c) {
                case ':':
                    state = State.ASSIGN;
                    break;
                case '*':
                    token = Token.MULT;
                    break;
                case ';':
                    token = Token.SEMI;
                    break;
                case '|':
                    token = Token.BAR;
                    break;
                case '-':
                    token = Token.MINUS;
                    break;
                case '+' :
                    token = Token.PLUS;
                case ',':
                    token = Token.COMMA;
                    break;
                case '(':
                    token = Token.PAR_OPEN;
                    break;
                case ')':
                    token = Token.PAR_CLOSE;
                    break;
                default:
                    throw new ParseException("Error parsing grammar, unidentified token " + next, pos);
            }
            state = State.DONE;
        }
    }

    public void processIdentifier() {
        if (eof() || !(isletter(next))) {
            token = Token.ID;
            state = State.DONE;
            skip_read = true;
        } else {
            stack += (char) next;
        }
    }

    public void processNat() {
        if (eof() || !(isnumber(next))) {
            token = Token.NAT;
            state = State.DONE;
            skip_read = true;
        } else {
            stack += (char) next;
        }
    }

    public void processAssign() throws ParseException {
        if (eof() || next != '=') {
            throw new ParseException(": sign is not followed by =, invalid syntax", pos);
        } else {
            token = Token.ASSIGN;
            state = State.DONE;
        }
    }

    public boolean iswhitespace(int c) {
        return c == ' ' || c == '\n';
    }

    public boolean isletter(int c) {
        return Character.isAlphabetic(c) && Character.isLowerCase(c);
    }

    public boolean isnumber(int c) {
        return Character.isDigit(c);
    }

    public boolean eof() {
        return next == -1;
    }

    public void next() {
        if (skip_read) {
            skip_read = false;
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
