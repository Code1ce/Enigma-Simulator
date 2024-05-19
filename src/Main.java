import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Enigma enigma = new Enigma();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("-c")) {
                for (int i = 0; i < enigma.getRotorsAmount(); i++) {
                    System.out.print("Rotor " + (i + 1) + ": ");
                    String rotorName = scanner.nextLine();
                    boolean cr = enigma.ChangeRotors(i, rotorName);
                    if (cr) {
                        System.out.println(enigma.getRotors());
                    } else {
                        System.out.println("Failed.");
                    }
                }
//                System.out.println("Please read README.md for more information.");
            } else if (command.equals("-i")) {
                System.out.println(enigma.getRotors());
            } else if (command.equals("-e")) {
                break;
            }
        }

    }

}