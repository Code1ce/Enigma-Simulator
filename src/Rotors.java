public class Rotors {

    private int rotorCode;

    private char rotorStep;

    private char rotorStatue;

    private String rotorValue;

    public Rotors(int rotorCode) {
        this.rotorCode = rotorCode;
        this.rotorStep = util.getRotorStep(rotorCode);
        this.rotorValue = util.getRotorValue(rotorCode);
        this.rotorStatue = 'A';
    }

    public static String codeToName(int rotorCodeInput) {
        return util.getRotorName(rotorCodeInput);
    }

    public static int nameToCode(String rotorNameInput) {
        return util.getRotorName().indexOf(rotorNameInput);
    }

    public int getRotorCode() {
        return rotorCode;
    }

    public char getRotorStep() {
        return rotorStep;
    }

    public char getRotorStatue() {
        return rotorStatue;
    }

    public boolean step() {
        rotorStatue = util.step(rotorStatue, 1);
        return rotorStatue == util.getRotorStep(rotorCode);
    }

    public char rotor(char c) {
        return rotorValue.charAt(util.c2i(util.step(c, util.c2i(rotorStatue))));
    }

    public char rotorBack(char c) {
        System.out.println(rotorValue.indexOf(util.step(c, util.c2i(rotorStatue))) + 65);
        return (char)(rotorValue.indexOf(util.step(c, util.c2i(rotorStatue))) + 65);
    }

}
