import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Enigma enigma = new Enigma();
        Scanner scanner = new Scanner(System.in);

        label:
        while (true) {
            String command = scanner.nextLine();
            switch (command) {

                case "/rotor":
                    try {
                        System.out.print("Which Rotor? ");
                        int rotorIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        System.out.print("To: ");
                        ChangeRotors(enigma, scanner, rotorIndex);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid command. (Can't find the rotor.)");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid command. (Not a number.)");
                    } catch (Exception e) {
                        System.out.println("Invalid command.");
                    }
                    break;

                case "/rotors":
                    for (int i = 0; i < enigma.getRotorsNumber(); i++) {
                        System.out.print("Rotor " + (i + 1) + ": ");
                        ChangeRotors(enigma, scanner, i);
                    }
                    break;

                case "/input":
                    System.out.print("Input: ");
                    String input = scanner.nextLine();
                    String output = enigma.encrypt(input);
                    System.out.println(output);
                    break;

                case "/number":
                    try {
                        System.out.print("Number of Rotors (3~5): ");
                        int rotorsNumber = Integer.parseInt(scanner.nextLine());
                        if (rotorsNumber >= 3 && rotorsNumber <= 5) {
                            enigma.changeRotorsNumber(rotorsNumber);
                        } else {
                            System.out.println("Invalid command.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid command.");
                    }
                    break;

                case "/info":
                    System.out.println(enigma.getRotors());
                    System.out.println(enigma.getRotorsStep());
                    break;

                case "/exit":
                    break label;

            }
        }

        System.out.println("Bye!");

    }

    private static void ChangeRotors(Enigma enigma, Scanner scanner, int rotorIndex) {
        String rotorName = scanner.nextLine();
        boolean cr = enigma.changeRotors(rotorIndex, rotorName);
        if (cr) {
            System.out.println("Succeeded.");
            System.out.println(enigma.getRotors());
        } else {
            System.out.println("Failed.");
            System.out.println(enigma.getRotors());
        }
    }

}