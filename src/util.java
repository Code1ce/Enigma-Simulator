import java.util.ArrayList;
import java.util.List;

public class util {

    private static final ArrayList<String> rotorsName = new ArrayList<>(
        List.of(new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII"})
    );

    private static final ArrayList<String> rotorsStep = new ArrayList<>(
        List.of(new String[]{"R", "F", "W", "K", "A", "N", "N", "N"})
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

    public static ArrayList<String> GetRotorName() {
        return rotorsName;
    }

    public static String GetRotorName(int i) {
        return rotorsName.get(i);
    }

    public static String GetRotorStep(int i) {
        return rotorsStep.get(i);
    }

    public static String GetRotorValue(int i) {
        return rotorsValue.get(i);
    }

    public static String GetReflectorName(int i) {
        return reflectorName.get(i);
    }

    public static String GetReflectorValue(int i) {
        return reflectorValue.get(i);
    }

    public static int c2i(char c) {
        return ((int)c - 65);
    }

}
