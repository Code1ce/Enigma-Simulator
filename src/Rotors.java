import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Rotors {

    private int rotorsCode;

    private static ArrayList<String> rotorsName = new ArrayList<>(List.of(new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "Beta", "Gamma"}));

    private static ArrayList<String> rotorsValue = new ArrayList<>(List.of(new String[]{
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
    }));

    public Rotors(int rotorsCode) {
        this.rotorsCode = rotorsCode;
    }

    public static String CodeToName(int rotorsCodeInput) {
        return rotorsName.get(rotorsCodeInput);
    }

    public static int NameToCode(String rotorsNameInput) {
        return rotorsName.indexOf(rotorsNameInput);
    }

    public int getRotorsCode() {
        return rotorsCode;
    }
}
