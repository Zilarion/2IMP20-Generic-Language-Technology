/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconQ1 extends Lexicon {
    public LexiconQ1() {
        super();
        // Add identifier lexeme
        addLexeme("ID", "[a-z] [a-z0-9]*");

        // Add natural number lexeme
        addLexeme("NAT", "[0]|[1-9][0-9]*");

        // Construct and add float lexeme
        String unsignedInt = "[0]|([1-9][0-9]*)";
        String signedInt = "[\\+\\-]?" + unsignedInt;
        String unsignedReal = "(" + unsignedInt + "." + "[0-9]+" + "([eE]" + signedInt + ")?)|" +
                              "(" + unsignedInt + "[eE]" + signedInt + ")";
        addLexeme("FLOAT",  "(" + unsignedInt + "|" + unsignedReal + ")");
    }

    @Override
    public void test() {
        System.out.println("------------------");
        System.out.println("Testing Lexicon Q1, language:");
        System.out.println(toString());
        System.out.println("-------START------");

        // ID tests
        executeTest("a aazz0220", "ID");
        executeTest("ax aazz0220", null);

        // NAT tests
        executeTest("0", "NAT");
        executeTest("1422119923", "NAT");
        executeTest("922323", "NAT");
        executeTest("023421", null);
        executeTest("xx@@$x822 92911@@", null);

        // FLOAT tests
        executeTest("0", "FLOAT");
        executeTest("1", "FLOAT");
        executeTest("14", "FLOAT");
        executeTest("0.1", "FLOAT");
        executeTest("3e4", "FLOAT");
        executeTest("3.014e-7", "FLOAT");
        executeTest("00", null);
        executeTest("01", null);
        executeTest("04.1", null);
        executeTest("3e04", null);
        executeTest("3.14e-07", null);

        System.out.println("-------DONE------");
    }
}
