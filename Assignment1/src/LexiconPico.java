/**
 * Created by ruudandriessen on 05/05/16.
 */
public class LexiconPico extends Lexicon {
    public LexiconPico() {
        super();
        // Add ID lexeme
        Lexeme IDLexeme = new Lexeme("ID").add("[a-z][a-z0-9]*");
        addLexeme(IDLexeme);
        // Add NAT lexeme
        Lexeme NATLexeme = new Lexeme("NAT").add("[0]|[1-9][0-9]*");
        addLexeme(NATLexeme);
        // Add LAYOUT lexeme
        Lexeme LAYOUTLexeme = new Lexeme("LAYOUT").add("[\\ \\n]+");
        addLexeme(LAYOUTLexeme);
        // Add BEGIN lexeme
        Lexeme BEGINLexeme = new Lexeme("BEGIN").add("begin");
        addLexeme(BEGINLexeme);
        // Add END lexeme
        Lexeme ENDLexeme = new Lexeme("END").add("end");
        addLexeme(ENDLexeme);
        // Add DECLARE lexeme
        Lexeme DECLARELexeme = new Lexeme("DECLARE").add("declare");
        addLexeme(DECLARELexeme);
        // Add BAR lexeme
        Lexeme BARLexeme = new Lexeme("BAR").add("\\|");
        addLexeme(BARLexeme);
        // Add COMMA lexeme
        Lexeme COMMALexeme = new Lexeme("COMMA").add(",");
        addLexeme(COMMALexeme);
        // Add SEMI lexeme
        Lexeme SEMILexeme = new Lexeme("SEMI").add(";");
        addLexeme(SEMILexeme);
        // Add ASSIGN lexeme
        Lexeme ASSIGNLexeme = new Lexeme("ASSIGN").add(":=");
        addLexeme(ASSIGNLexeme);
        // Add PAR_OPEN lexeme
        Lexeme PAR_OPENLexeme = new Lexeme("PAR_OPEN").add("\\(");
        addLexeme(PAR_OPENLexeme);
        // Add PAR_CLOSE lexeme
        Lexeme PAR_CLOSELexeme = new Lexeme("PAR_CLOSE").add("\\)");
        addLexeme(PAR_CLOSELexeme);
        // Add MINUS lexeme
        Lexeme MINUSLexeme = new Lexeme("MINUS").add("-");
        addLexeme(MINUSLexeme);
        // Add PLUS lexeme
        Lexeme PLUSLexeme = new Lexeme("PLUS").add("\\+");
        addLexeme(PLUSLexeme);
        // Add MULT lexeme
        Lexeme MULTLexeme = new Lexeme("MULT").add("\\*");
        addLexeme(MULTLexeme);
    }

    @Override
    public void test() {
        System.out.println("");
        System.out.println("Testing Lexicon Pico with language definition:");
        System.out.println(toString());
        System.out.println("");
        printHeader();

        // STRING tests
        executeTest("a", "ID");
        executeTest("a1", "ID");
        executeTest("ab", "ID");
        executeTest("ab2", "ID");
        executeTest("0", "NAT");
        executeTest("1", "NAT");
        executeTest("123", "NAT");
        executeTest(" ", "LAYOUT");
        executeTest("begin", "BEGIN");
        executeTest("end", "END");
        executeTest("declare", "DECLARE");
        executeTest("|", "BAR");
        executeTest(",", "COMMA");
        executeTest(";", "SEMI");
        executeTest(":=", "ASSIGN");
        executeTest("(", "PAR_OPEN");
        executeTest(")", "PAR_CLOSE");
        executeTest("-", "MINUS");
        executeTest("+", "PLUS");
        executeTest("*", "MULT");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
