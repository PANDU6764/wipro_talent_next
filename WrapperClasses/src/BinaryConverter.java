import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 255: ");

        try {
            int number = scanner.nextInt();

            if (number < 1 || number > 255) {
                System.out.println("Error: Number must be between 1 and 255.");
            } else {
                String binary = Integer.toBinaryString(number);
                String formattedBinary = String.format("%8s", binary).replace(' ', '0');
                System.out.println("8-bit binary representation: " + formattedBinary);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
