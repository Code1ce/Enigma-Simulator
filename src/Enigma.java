import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Enigma {

    private int rotorsAmount;

    private ArrayList<Rotors> rotors = new ArrayList<>();

    private ArrayList<Integer> rotorsStatue = new ArrayList<>(List.of(new Integer[]{0, 0, 0}));

    private Reflector reflector = new Reflector(0);

    public Enigma() {
        this.rotorsAmount = 3;
        for (int i = 0; i < this.rotorsAmount; i++) {
            rotors.add(new Rotors(i));
        }
    }

    public boolean ChangeRotors(int i, String rotorName) {
        if (Rotors.NameToCode(rotorName) == -1) {
            return false;
        } else {
            this.rotors.set(i, new Rotors(Rotors.NameToCode(rotorName)));
            return true;
        }
    }

    public void ChangeRotorsAmount(int rotorsAmount) {
        this.rotorsAmount = rotorsAmount;
        if (rotors.size() > rotorsAmount) {
            rotors.subList(rotorsAmount, rotors.size()).clear();
        } else {
            for (int i = rotors.size(); i < rotorsAmount; i++) {
                rotors.add(new Rotors(0));
            }
        }
    }

    public int GetRotorsAmount() {
        return rotorsAmount;
    }

    public ArrayList<String> GetRotors() {
        ArrayList<String> rotors = new ArrayList<>();
        for (Rotors rotor : this.rotors) {
            rotors.add(Rotors.CodeToName(rotor.GetRotorsCode()));
        }
        return rotors;
    }

    public ArrayList<Integer> GetRotorsInt() {
        ArrayList<Integer> rotors = new ArrayList<>();
        for (Rotors rotor : this.rotors) {
            rotors.add(rotor.GetRotorsCode());
        }
        return rotors;
    }

    public ArrayList<Integer> GetRotorsIntReverse() {
        ArrayList<Integer> rotors = new ArrayList<>();
        Collections.reverse(rotors);
        for (Rotors rotor : this.rotors) {
            rotors.add(rotor.GetRotorsCode());
        }
        return rotors;
    }

    public int GetReflector() {
        return reflector.GetReflectorCode();
    }

    public String Encrypt(String input) {
        StringBuilder output = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                output.append(c);
            } else {
                for (int i : GetRotorsInt()) {

                }
            }
        }
        return output.toString();
    }

}
