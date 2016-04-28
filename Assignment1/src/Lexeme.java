import java.util.ArrayList;

/**
 * Created by ruudandriessen on 28/04/16.
 */
public class Lexeme {
    ArrayList<Lexeme> subLexemes;
    String identifier;
    String regex;

    public Lexeme(String id) {
        identifier = id;
        subLexemes = new ArrayList<>();
    }

    public Lexeme add(Lexeme lexeme) {
        subLexemes.add(lexeme);
        return this;
    }

    public Lexeme add(String stringLexeme) {
        Lexeme leafLexeme = new Lexeme(null);
        leafLexeme.setRegex(stringLexeme);
        subLexemes.add(leafLexeme);
        return this;
    }

    private void setRegex(String regex) {
        this.regex = regex;
    }

    public String regex() {
        String result = "";
        if (identifier != null) {
            result += "(";
        }
        if (regex != null) {
            result += regex;
        } else {
            for (Lexeme l : subLexemes) {
                result += l.regex();
            }
        }
        if (identifier != null) {
            result += ")";
        }
        return result;
    }

    public String string() {
        return string(0);
    }

    public String string(int depth) {
        String result = "";
        if (identifier == null || depth == 0) {
            if (regex == null) {
                for (Lexeme l : subLexemes) {
                    result += l.string(depth + 1);
                }
            } else {
                result += regex;
            }
        } else {
            result += identifier;
        }
        return result;
    }
}