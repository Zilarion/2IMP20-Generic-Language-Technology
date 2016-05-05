/**
 * Created by ruudandriessen on 05/05/16.
 */
public class LexiconPico extends Lexicon {
    public LexiconPico() {
        super();
        // Add String lexeme
        Lexeme stringLexeme = new Lexeme("ID").add("|");
        addLexeme(stringLexeme);
    }

    @Override
    public void test() {

    }
}
