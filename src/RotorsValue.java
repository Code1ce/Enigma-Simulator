import java.util.ArrayList;
import java.util.List;

public class RotorsValue {

    private static final ArrayList<String> rotorsValue = new ArrayList<>();

    private static String[] rv = {
        "EKMFLGDQVZNTOWYHXUSPAIBRCJ",
        "AJDKSIRUXBLHWTMCQGZNPYFVOE",
        "BDFHJLCPRTXVZNYEIWGAKMUSQO",
        "ESOVPZJAYQUIRHXLNFTGKDCMWB",
        "VZBRGITYUPSDNHLXAWMJQOFECK",
        "JPGVOUMFYQBENHZRDKASXLICTW",
        "NZJHGRCXMYSWBOUFAIVLPEKQDT",
        "FKQHTLXOCBJSPDZRAMEWNIUYGV",
        "LEYJVCNIXWPBQMDRTAKZGFUHOS",
        "FSOKANUERHMBTIYCWLQPZXVGJD",
    };

    public static void RotorsValue() {
        rotorsValue.addAll(List.of(rv));
    }

    public static String getRotorsValue(int i) {
        return rotorsValue.get(i);
    }
}
