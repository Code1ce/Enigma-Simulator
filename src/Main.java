import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Enigma enigma = new Enigma();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine();
            if (command.equals("/rotor")) {
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
            } else if (command.equals("/rotors")) {
                for (int i = 0; i < enigma.GetRotorsAmount(); i++) {
                    System.out.print("Rotor " + (i + 1) + ": ");
                    ChangeRotors(enigma, scanner, i);
                }
            } else if (command.equals("/input")) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                String output = enigma.Encrypt(input);
            } else if (command.equals("/number")) {
                try {
                    System.out.print("Number of Rotors (3~5): ");
                    int rotorsAmount = Integer.parseInt(scanner.nextLine());
                    enigma.ChangeRotorsAmount(rotorsAmount);
                } catch (Exception e) {
                    System.out.println("Invalid command.");
                }
            } else if (command.equals("/info")) {
                System.out.println(enigma.GetRotors());
            } else if (command.equals("/exit")) {
                break;
            }
        }

        System.out.println("Bye!");

    }

    private static void ChangeRotors(Enigma enigma, Scanner scanner, int rotorIndex) {
        String rotorName = scanner.nextLine();
        boolean cr = enigma.ChangeRotors(rotorIndex, rotorName);
        if (cr) {
            System.out.println("Succeeded.");
            System.out.println(enigma.GetRotors());
        } else {
            System.out.println("Failed.");
            System.out.println(enigma.GetRotors());
        }
    }

}