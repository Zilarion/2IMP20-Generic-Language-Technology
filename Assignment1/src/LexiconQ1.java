/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconQ1 extends Lexicon {
    public LexiconQ1() {
        super();
        // Add identifier lexeme
        addLexeme("ID", "[a-z] [a-z0-9]*");

        // Add natural number lexeme
        addLexeme("NAT", "[0] | [1-9][0-9]*");

        // Construct and add float lexeme
        String unsignedInt = "[0] | ([1-9][0-9]*)";
        String signedInt = "[\\+\\-]?" + unsignedInt;
        String unsignedReal = unsignedInt + "." + "[0-9]+" + "([eE]" + signedInt + ")?";
        addLexeme("FLOAT",  unsignedInt + "|" + unsignedReal );
    }

    @Override
    public void test() {
        System.out.println("------------------");
        System.out.println("Testing Lexicon Q1, language:");
        System.out.println(toString());
        System.out.println("-------START------");

        assert classify("a aazz0220").equals("ID");
        assert classify("ax aazz0220").equals(null);

        assert classify("023421").equals("NAT");
        assert classify("xx@@$x822 92911@@").equals(null);
        assert classify("a aazz0220").equals("ID");

        System.out.println("-------PASSED------");
    }
}
