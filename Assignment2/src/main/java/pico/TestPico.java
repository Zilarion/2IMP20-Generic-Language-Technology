package pico;

import beaver.Parser;

import java.io.*;

/**
 * Created by ruudandriessen on 12/05/16.
 */
public class TestPico {

    public static void main(String[] args) {
        test("Test1.pico", true);
        test("Test2.pico", true);
        test("Test3.pico", true);
        test("Test4.pico", true);

        test("Test1Fail.pico", false);
        test("Test2Fail.pico", false);
        test("Test3Fail.pico", false);
        test("Test4Fail.pico", false);
        test("Test5Fail.pico", false);
    }

    public static void test(String name, boolean expected) {
        boolean success = true;
        try {
            // Read input
            FileReader reader = new FileReader("./src/main/resources/" + name);

            // Parse
            PicoParser parser = new PicoParser();
            PicoScanner scanner = new PicoScanner(reader);
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
