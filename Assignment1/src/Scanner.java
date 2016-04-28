/**
 * Created by ruudandriessen on 28/04/16.
 */
public class Scanner {
    public static void main(String[] args) {
        LexiconQ1 q1 = new LexiconQ1();
        q1.test();

        LexiconJavaComment lexJavaComment = new LexiconJavaComment();
        lexJavaComment.test();

        LexiconMatlabComment lexMatlabComment = new LexiconMatlabComment();
        lexMatlabComment.test();
    }
}
