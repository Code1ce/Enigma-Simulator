import java.util.ArrayList;
import java.util.List;

public class Reflector {

    private int reflectorCode;

    private static ArrayList<String> reflectorName = new ArrayList<>(List.of(new String[]{"B", "C"}));

    private static ArrayList<String> reflectorValue = new ArrayList<>();

    public Reflector(int reflectorCode) {
        this.reflectorCode = reflectorCode;
        reflectorValue.add("YRUHQSLDPXNGOKMIEBFZCWVJAT");
        reflectorValue.add("FVPJIAOYEDRZXWGCTKUQSBNMHL");
    }

    public static String CodeToName(int reflectorCodeInput) {
        return reflectorName.get(reflectorCodeInput);
    }

    public static int NameToCode(String reflectorNameInput) {
        return reflectorName.indexOf(reflectorNameInput);
    }

    public void ChangeReflectorCode(int reflectorCode) {
        this.reflectorCode = reflectorCode;
    }

    public int GetReflectorCode() {
        return reflectorCode;
    }

}
