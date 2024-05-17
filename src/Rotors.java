

public class Rotors {

    private int RotorsCode;

    private String RotorsValue;

    public Rotors() {

    }

    public Rotors(int RotorsCode) {
        this.RotorsCode = RotorsCode;
        RotorsValue = new RotorsValue().getRotorsValue().get(RotorsCode);
        this.RotorsValue = RotorsValue;
    }
}
