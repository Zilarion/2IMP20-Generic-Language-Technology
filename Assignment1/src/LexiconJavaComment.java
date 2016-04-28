/**
 * Created by ruudandriessen on 28/04/16.
 */
public class LexiconJavaComment extends Lexicon {
    public LexiconJavaComment() {
        super();

        Lexeme lineComment = new Lexeme("LineComment").add("\\/\\/.*");
        Lexeme endBlockComment = new Lexeme("endBlockComment").add("[\\ ]*\\*\\/");
        Lexeme startBlockComment = new Lexeme("startBlockComment").add("[\\ ]*\\/\\*\\*?.*\\n?");
        Lexeme blockLineComment = new Lexeme("blockLineComment").add("[\\ ]*\\*.*");
        Lexeme blockComment = new Lexeme("BlockComment")
                                .add(startBlockComment)
                                .add("(").add(blockLineComment).add("\\n)*")
                                .add("(").add(blockLineComment).add(")?").add(endBlockComment);

        System.out.println(blockComment.regex());
        addLexeme(lineComment);
        addLexeme(blockComment);
    }

    @Override
    public void test() {
        System.out.println("------------------");
        System.out.println("Testing Lexicon Java comments with language definition:");
        System.out.println(toString());
        System.out.println("-------START------");

        // Valid line comment tests
        executeTest("// this is a comment", "LineComment");
        executeTest("// this is a comment with more // in it", "LineComment");

        // Invalid line comment tests
        executeTest("/ this is not a comment", null);
        executeTest("this is not a comment // even though we have two slashes in it", null);

        // Valid block comment tests
        executeTest("/** this is a javadoc comment \n * where we have multiple lines and end normally\n */", "BlockComment");
        executeTest("/* this is a java comment \n * where we have multiple lines and end normally\n */", "BlockComment");
        executeTest("/** this is a javadoc comment \n * with one empty line \n * \n */", "BlockComment");
        executeTest("/* this is a java comment \n * with one empty line \n * \n */", "BlockComment");
        executeTest("/** this is a javadoc comment \n * with a sudden ending */", "BlockComment");
        executeTest("/* this is a java comment \n * with a sudden ending */", "BlockComment");
        executeTest("/** this is a javadoc comment on one line */", "BlockComment");
        executeTest("/* this is a java comment on one line */", "BlockComment");
        executeTest("/** this is a javadoc comment with lots ** of ***** in it */", "BlockComment");
        executeTest("/* this is a java comment with lots ** of ***** in it */", "BlockComment");

        // Invalid block comment tests
        executeTest("/** this is a javadoc comment without end", null);
        executeTest("/* this is a java comment without end", null);
        executeTest("this is a comment without start */", null);
        executeTest("/** this is a javadoc comment \n * without one \n proper middle line */", null);
        executeTest("/* this is a java comment \n  without proper middle line */", null);

        executeTest("/** this is a javadoc comment with a nested comment /** */ so this is no longer a comment :( */", null);
        executeTest("/** this is a java comment with a nested comment /** */ so this is no longer a comment :( */", null);
    }
}
