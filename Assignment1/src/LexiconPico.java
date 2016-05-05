/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconPico extends Lexicon {
    public LexiconPico() {
        super();

        // Add identifier lexeme
        Lexeme idLexeme = new Lexeme("ID").add("[a-z][a-z0-9]*");
        addLexeme(idLexeme);

        // Add natural number lexeme
        Lexeme natLexeme = new Lexeme("NAT").add("[0-9]+");
        addLexeme(natLexeme);

        // Add layout lexeme
        Lexeme layoutLexeme = new Lexeme("LAYOUT").add("[\\ \\n]*");
        addLexeme(layoutLexeme);

        // Add expression lexeme
        Lexeme expressionLexeme = new Lexeme("EXP")
                .add(idLexeme).add("|")
                .add(natLexeme).add("|")
                .add(idLexeme).add("|").add(natLexeme).add("*");
        addLexeme(expressionLexeme);

        // Add statement lexeme
        Lexeme statementLexeme = new Lexeme("STATEMENT").add(idLexeme).add(":=").add(expressionLexeme);
        addLexeme(statementLexeme);
    }

    @Override
    public void test() {

    }
}
