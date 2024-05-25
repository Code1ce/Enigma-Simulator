import java.util.ArrayList;
import java.util.List;

public class Rotors {

    private int rotorCode;

    public Rotors(int rotorCode) {
        this.rotorCode = rotorCode;
    }

    public static String CodeToName(int rotorCodeInput) {
        return util.GetRotorName(rotorCodeInput);
    }

    public static int NameToCode(String rotorNameInput) {
        return util.GetRotorName().indexOf(rotorNameInput);
    }

    public int GetRotorsCode() {
        return rotorCode;
    }

    public static char Rotor(char c) {
        return c;
    }

}
