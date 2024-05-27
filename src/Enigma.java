import java.util.ArrayList;
import java.util.Collections;

public class Enigma {

    private int rotorsNumber;

    private ArrayList<Rotors> rotors = new ArrayList<>();

    private ArrayList<Character> rotorsStep = new ArrayList<>();

    private Reflector reflector = new Reflector(0);

    public Enigma() {
        this.rotorsNumber = 3;
        for (int i = 0; i < this.rotorsNumber; i++) {
            rotors.add(new Rotors(i));
            rotorsStep.add(rotors.get(i).getRotorStep());
        }
    }

    public boolean changeRotors(int i, String rotorName) {
        if (Rotors.nameToCode(rotorName) == -1) {
            return false;
        } else {
            rotors.set(i, new Rotors(Rotors.nameToCode(rotorName)));
            rotorsStep.set(i, util.getRotorStep(Rotors.nameToCode(rotorName)));
            return true;
        }
    }

    public void changeRotorsNumber(int rotorsNumber) {
        this.rotorsNumber = rotorsNumber;
        if (rotors.size() > rotorsNumber) {
            rotorsStep.subList(rotorsNumber, rotors.size()).clear();
            rotors.subList(rotorsNumber, rotors.size()).clear();
        } else {
            for (int i = rotors.size(); i < rotorsNumber; i++) {
                rotors.add(new Rotors(0));
                rotorsStep.add(util.getRotorStep(0));
            }
        }
    }

    public int getRotorsNumber() {
        return rotorsNumber;
    }

    public ArrayList<String> getRotors() {
        ArrayList<String> rotors = new ArrayList<>();
        for (Rotors rotor : this.rotors) {
            rotors.add(Rotors.codeToName(rotor.getRotorCode()));
        }
        return rotors;
    }

    public ArrayList<Integer> getRotorsInt() {
        ArrayList<Integer> rotors = new ArrayList<>();
        for (Rotors rotor : this.rotors) {
            rotors.add(rotor.getRotorCode());
        }
        return rotors;
    }

    public ArrayList<Character> getRotorsStep() {
        return rotorsStep;
    }

    public ArrayList<Integer> getRotorsIntReverse() {
        ArrayList<Integer> rotors = new ArrayList<>();
        Collections.reverse(rotors);
        for (Rotors rotor : this.rotors) {
            rotors.add(rotor.getRotorCode());
        }
        return rotors;
    }

    public int getReflector() {
        return reflector.getReflectorCode();
    }

    public String encrypt(String input) {
        StringBuilder output = new StringBuilder();
        ArrayList<Rotors> rotorsTemp = rotors;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                output.append(c);
            } else {
                for (int i = 0; i < rotorsNumber; i++) {
                    if (!rotors.get(i).step()) {
                        break;
                    }
                }
                for (Rotors r : rotorsTemp) {
                    c = (char)(r.rotor(c) - util.c2i(r.getRotorStatue()));
                }
                System.out.println(c);
                c = reflector.reflect(c);
                System.out.println(c);
                Collections.reverse(rotorsTemp);
                for (Rotors r : rotorsTemp) {
                    c = (char)(r.rotorBack(c) - util.c2i(r.getRotorStatue()));
                    System.out.println(r.getRotorCode() + " " + c);
                }
                output.append(c);
                Collections.reverse(rotorsTemp);
            }
        }
        return output.toString();
    }

}
