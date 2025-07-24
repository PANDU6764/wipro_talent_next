package Input_Output_Streams_operations;
import java.io.*;
import java.util.*;

public class FileWordCount {
 public static void main(String[] args) {
     if (args.length < 2) {
         System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
         return;
     }

     String inputFile = args[0];
     String outputFile = args[1];

     Map<String, Integer> wordCountMap = new TreeMap<>();

     try (
         BufferedReader br = new BufferedReader(new FileReader(inputFile));
         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))
     ) {
         String line;

         while ((line = br.readLine()) != null) {
             String[] words = line.split("\\s+");

             for (String word : words) {
                 if (!word.isEmpty()) {
                     wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                 }
             }
         }

         
         for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
             bw.write(entry.getKey() + " : " + entry.getValue());
             bw.newLine();
         }

         System.out.println("Word count written to " + outputFile);
     } catch (IOException e) {
         System.out.println("An error occurred: " + e.getMessage());
     }
 }
}
