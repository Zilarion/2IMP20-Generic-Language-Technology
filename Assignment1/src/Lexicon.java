import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ruudandriessen on 28/04/16.
 */
public abstract class Lexicon {
    HashMap<String, Automaton> lexemes;
    HashMap<String, String> lexemesRegex;

    public Lexicon() {
        lexemes = new HashMap<>();
        lexemesRegex = new HashMap();
    }

    /**
     * Adds a new lexeme to the lexicon with a given identifier
     * @param identifier The identifier to use for this lexeme
     * @param lexeme The lexeme to use for this identifier
     */
    public void addLexeme(String identifier, String lexeme) {
        RegExp r = new RegExp(lexeme);
        Automaton automaton =  r.toAutomaton();
        lexemes.put(identifier, automaton);
        lexemesRegex.put(identifier, lexeme);
    }

    /**
     * Returns regex from lexeme with given identifier
     * @param identifier The identifier to search for
     * @return Regex string if found, null otherwise
     */
    public String getLexeme(String identifier) {
        return lexemesRegex.get(identifier);
    }

    /**
     * Attempts to classify given string using known lexemes
     * @param string The given input string
     * @return identifier of the lexeme if match, null if no match
     */
    public HashSet<String> classify(String string) {
        HashSet<String> results = new HashSet<>();
        for (String identifier : lexemes.keySet()) {
            Automaton a = lexemes.get(identifier);
            if (a.run(string)) {
                results.add(identifier);
            }
        }
        return results;
    }
    /**
     * Tests the lexicon with a set of test cases
     */
    public abstract void test();

    /**
     * Executes a test on a given input string using the lexicon given a set of filters
     * @param string The input string to use
     * @param expectedResult The expected result of the test
     */
    protected void executeTest(String string, String expectedResult) {
        // Execute test
        long start = System.nanoTime();
        HashSet<String> results = classify(string);
        long end = System.nanoTime();

        // Check the result
        boolean match = false;
        if (results.size() == 0 && expectedResult == null) {
            match = true;
        }

        for (String result : results) {
            if (compare(expectedResult, result)) {
                match = true;
                break;
            }
        }

        // Calculate delta
        String delta =  Long.toString(end - start);

        // Construct string
        String resultString = match ? "Pass" : "! Fail";
        String operatorString = String.format("%10s\t\t| %25s", expectedResult == null ? (char) 8709 : expectedResult, results);
        String output = String.format("%s\t->\t%s\t@\t%8s ms\t(%s)", resultString, operatorString, delta, string);

        System.out.println(output);
    }

    /**
     * Compares two possible null strings
     * @param str1
     * @param str2
     * @return true if str1.equals(str2) or str1 == null == str2
     */
    private boolean compare(String str1, String str2) {
        return (str1 == null ? str2 == null : str1.equals(str2));
    }

    /**
     * Prints the lexicon language with identifiers and regex
     * @return The string representation of the lexicon
     */
    public String toString() {
        String language = "";
        for (String identifier : lexemesRegex.keySet()) {
            language += String.format("%5s :== \t%5s", identifier, lexemesRegex.get(identifier)) + "\n";
        }
        return language;
    }
}
