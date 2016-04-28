/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconMatlabComment extends Lexicon {
    public LexiconMatlabComment() {
        super();

        Lexeme lineComment = new Lexeme("LineComment").add("\\%~#");
        Lexeme blockComment = new Lexeme("BlockComment").add("\\%\\{+~#\\%\\}");

        addLexeme(lineComment);
        addLexeme(blockComment);
    }

    @Override
    public void test() {
        System.out.println("");
        System.out.println("Testing Lexicon Matlab comments with language definition:");
        System.out.println(toString());
        System.out.println("");
        printHeader();

        // Valid line comment tests
        executeTest("%", "LineComment");
        executeTest("% this is a comment", "LineComment");
        executeTest("% this is a comment with more % in it", "LineComment");

        // Invalid line comment tests
        executeTest("// this is not a comment", null);
        executeTest("this is not a comment % even though we have a percentage sign in it in it", null);

        // Valid block comment tests
        executeTest("%{ this is a MATLAB comment \n where we have multiple lines and end normally\n %}", "BlockComment");
        executeTest("%{ this is a MATLAB comment \n with one empty line \n \n %}", "BlockComment");
        executeTest("%{ this is a MATLAB comment \n with a sudden ending %}", "BlockComment");
        executeTest("%{ this is a MATLAB comment block on one line %}", "BlockComment");
        executeTest("%{ this is a MATLAB comment with lots of %%%% in it %}", "BlockComment");

        // Invalid block comment tests
        executeTest("%{ this is a MATLAB comment without end", "LineComment");
        executeTest("this is a MATLAB comment without start %}", null);
        executeTest("%{ this is a MATLAB comment with an interrupted end %ff}", "LineComment");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}
