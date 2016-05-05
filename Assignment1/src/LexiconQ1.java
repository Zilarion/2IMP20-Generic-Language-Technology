/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconQ1 extends Lexicon {
    public LexiconQ1() {
        super();

        // Add identifier lexeme
        Lexeme idLexeme = new Lexeme("ID").add("[a-z][a-z0-9]*");
        addLexeme(idLexeme);

        // Add natural number lexeme
        Lexeme natLexeme = new Lexeme("NAT").add("[0]|[1-9][0-9]*");
        addLexeme(natLexeme);

        // Construct float Lexeme
        Lexeme unsignedInt = new Lexeme("unsignedInt").add("[0]|[1-9][0-9]*");
        Lexeme signedInt = new Lexeme("signedInt").add("[\\+\\-]?").add(unsignedInt);
        Lexeme unsignedReal = new Lexeme("unsignedReal").add(unsignedInt).add("\\.[0-9]+([eE]").add(signedInt).add(")?|")
                                .add(unsignedInt).add("[eE]").add(signedInt);

        Lexeme floatLexeme = new Lexeme("FLOAT").add(unsignedInt).add("|").add(unsignedReal);
        addLexeme(floatLexeme);
    }

    @Override
    public void test() {
        System.out.println("");
        System.out.println("Testing Lexicon Q1 with language definition:");
        System.out.println(toString());
        System.out.println("");
        printHeader();

        // ID tests
        executeTest("aaazz0220", "ID");
        executeTest("0xaazz0220", null);

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
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
