import java.util.ArrayList;

public class Enigma {

    private int rotorsAmount;

    private ArrayList<Rotors> rotors = new ArrayList<>();

    private ArrayList<String> rotorsValue = new ArrayList<>();

    public Enigma() {
        rotorsValue.add("EKMFLGDQVZNTOWYHXUSPAIBRCJ");
        rotorsValue.add("AJDKSIRUXBLHWTMCQGZNPYFVOE");
        rotorsValue.add("BDFHJLCPRTXVZNYEIWGAKMUSQO");
        rotorsValue.add("ESOVPZJAYQUIRHXLNFTGKDCMWB");
        rotorsValue.add("VZBRGITYUPSDNHLXAWMJQOFECK");
        rotorsValue.add("JPGVOUMFYQBENHZRDKASXLICTW");
        rotorsValue.add("NZJHGRCXMYSWBOUFAIVLPEKQDT");
        rotorsValue.add("FKQHTLXOCBJSPDZRAMEWNIUYGV");
        rotorsValue.add("LEYJVCNIXWPBQMDRTAKZGFUHOS");
        rotorsValue.add("FSOKANUERHMBTIYCWLQPZXVGJD");

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
        if (rotors.size() < rotorsAmount) {
            rotors.subList(rotors.size() + 1, rotorsAmount + 1).clear();
        } else if (rotors.size() > rotorsAmount) {
            for (int i = rotorsAmount; i < rotors.size(); i++) {
                rotors.add(new Rotors(1));
            }
        }
    }

    public int getRotorsAmount() {
        return rotorsAmount;
    }

    public ArrayList<String> getRotors() {
        ArrayList<String> rotors = new ArrayList<>();
        for (Rotors rotor : this.rotors) {
            // I wrote this when I was about to fall asleep...
            rotors.add(Rotors.CodeToName(rotor.getRotorsCode()));
        }
        return rotors;
    }
}
