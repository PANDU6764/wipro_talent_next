package Input_Output_Streams_operations;
import java.io.*;
import java.util.Scanner;

public class FileCopy {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the input file name: ");
     String inputFile = scanner.nextLine();

     System.out.print("Enter the output file name: ");
     String outputFile = scanner.nextLine();

     try (
         FileReader fr = new FileReader(inputFile);
         BufferedReader br = new BufferedReader(fr);
         FileWriter fw = new FileWriter(outputFile);
         BufferedWriter bw = new BufferedWriter(fw)
     ) {
         String line;
         while ((line = br.readLine()) != null) {
             bw.write(line);
             bw.newLine(); // Preserve line breaks
         }

         System.out.println("File is copied.");
     } catch (FileNotFoundException e) {
         System.out.println("Input file not found: " + inputFile);
     } catch (IOException e) {
         System.out.println("Error during file copying: " + e.getMessage());
     }

     scanner.close();
 }
}
