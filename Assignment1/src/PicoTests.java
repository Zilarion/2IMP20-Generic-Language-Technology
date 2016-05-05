import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

/**
 * Created by ruudandriessen on 05/05/16.
 */
public class PicoTests {
    public static void main(String[] args) {
        // Check simple valid input
        test("./input/Empty.pico", true);
        test("./input/SingleDeclr.pico", true);
        test("./input/SingleStatement.pico", true);

        // Check complex valid input
        test("./input/MultiDeclr.pico", true);
        test("./input/MultiStatement.pico", true);
        test("./input/SimplePar.pico", true);
        test("./input/AssignToFromDeclr.pico", true);
        test("./input/ComplexStatements.pico", true);
        test("./input/WhiteSpaceComplexStatements.pico", true);

        // Check for invalid input
        test("./input/InvalidMultiDeclr.pico", false);
        test("./input/InvalidSecondDeclr.pico", false);
        test("./input/NoSemiColumn.pico", false);
        test("./input/MultiStatementInvalidAssign.pico", false);
        test("./input/InvalidOperators.pico", false);
    }

    public static void test(String file, boolean expected) {
        File f = new File(file);
        PicoRec parser = null;
        try {
            parser = new PicoRec(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean pass = false;
        try {
            pass = parser.run();
        } catch (ParseException e) {
        }
        System.out.println((pass == expected ? "Pass" : "Fail") + " --> Tested on " + f.getName());
    }
}
