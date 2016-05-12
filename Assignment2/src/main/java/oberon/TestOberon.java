package oberon;

import beaver.Parser;

import java.io.*;

/**
 * Created by ruudandriessen on 12/05/16.
 */
public class TestOberon {

    public static void main(String[] args) {
        test("Test1.oberon", true);
        test("Test2.oberon", true);
        test("Test3.oberon", true);
    }

    public static void test(String name, boolean expected) {
        boolean success = true;
        try {
            // Read input
            FileReader reader = new FileReader("./src/main/resources/" + name);

            // Parse
            OberonParser parser = new OberonParser();
            OberonScanner scanner = new OberonScanner(reader);
            parser.parse(scanner);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Parser.Exception e) {
            success = false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print result
        System.out.println((success == expected ? "Pass" : "Fail") + " -> " + name + " / expected: " + expected + " / actual: " + success);
    }
}
