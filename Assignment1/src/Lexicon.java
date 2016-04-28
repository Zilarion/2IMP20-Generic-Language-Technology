import dk.brics.automaton.Automaton;
import dk.brics.automaton.RegExp;

import java.util.ArrayList;
import java.util.HashMap;

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
     * Attempts to classify given string using filtered lexemes
     * @param string The given input string
     * @param filter The filters to use for the classification
     * @return identifier of the lexeme if matched and in filter, null if no match
     */
    public String classify(String string, ArrayList<String> filter) {
        for (String identifier : lexemes.keySet()) {
            if (filter.contains(identifier)) {
                Automaton a = lexemes.get(identifier);
                if (a.run(string)) {
                    return identifier;
                }
            }
        }
        return null;
    }

    /**
     * Attempts to classify given string using known lexemes
     * @param string The given input string
     * @return identifier of the lexeme if match, null if no match
     */
    public String classify(String string) {
        return classify(string, new ArrayList<>());
    }

    /**
     * Tests the lexicon with a set of test cases
     */
    public abstract void test();

    protected boolean executeTest(String string, boolean expected) {

    }

    public String toString() {
        String language = "";
        for (String identifier : lexemesRegex.keySet()) {
            language += String.format("%5s :== \t%5s", identifier, lexemesRegex.get(identifier)) + "\n";
        }
        return language;
    }
}
