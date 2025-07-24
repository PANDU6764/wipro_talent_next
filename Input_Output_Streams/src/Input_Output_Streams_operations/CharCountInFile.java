package Input_Output_Streams_operations;
import java.io.*;
import java.util.Scanner;

public class CharCountInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        
        System.out.print("Enter the character to be counted: ");
        char inputChar = scanner.nextLine().charAt(0);
        char targetChar = Character.toLowerCase(inputChar);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count +
                " instances of letter '" + inputChar + "'.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
