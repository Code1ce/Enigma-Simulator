import java.util.ArrayList;
import java.util.List;

public class util {

    private static final ArrayList<String> rotorsName = new ArrayList<>(
        List.of(new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII"})
    );

    private static final ArrayList<Character> rotorsStep = new ArrayList<>(
        List.of(new Character[]{'R', 'F', 'W', 'K', 'A', 'N', 'N', 'N'})
    );

    private static final ArrayList<String> rotorsValue = new ArrayList<>(
        List.of(new String[]{
            "EKMFLGDQVZNTOWYHXUSPAIBRCJ",
            "AJDKSIRUXBLHWTMCQGZNPYFVOE",
            "BDFHJLCPRTXVZNYEIWGAKMUSQO",
            "ESOVPZJAYQUIRHXLNFTGKDCMWB",
            "VZBRGITYUPSDNHLXAWMJQOFECK",
            "JPGVOUMFYQBENHZRDKASXLICTW",
            "NZJHGRCXMYSWBOUFAIVLPEKQDT",
            "FKQHTLXOCBJSPDZRAMEWNIUYGV",
            "LEYJVCNIXWPBQMDRTAKZGFUHOS",
            "FSOKANUERHMBTIYCWLQPZXVGJD"
        })
    );

    private static final ArrayList<String> reflectorName = new ArrayList<>(
        List.of(new String[]{"B", "C"})
    );

    private static final ArrayList<String> reflectorValue = new ArrayList<>(
        List.of(new String[]{
            "YRUHQSLDPXNGOKMIEBFZCWVJAT",
            "FVPJIAOYEDRZXWGCTKUQSBNMHL"
        })
    );

    public static ArrayList<String> getRotorName() {
        return rotorsName;
    }

    public static String getRotorName(int i) {
        return rotorsName.get(i);
    }

    public static char getRotorStep(int i) {
        return rotorsStep.get(i);
    }

    public static String getRotorValue(int i) {
        return rotorsValue.get(i);
    }

    public static String getReflectorName(int i) {
        return reflectorName.get(i);
    }

    public static String getReflectorValue(int i) {
        return reflectorValue.get(i);
    }

    public static int c2i(char c) {
        return (int)c - 65;
    }

    public static char step(char c, int i) {
        if (c + i > 90) {
            return (char)(c + i - 26);
        } else {
            return (char)(c + i);
        }
    }

}
