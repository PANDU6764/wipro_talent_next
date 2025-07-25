package Lambda_Expressions;


@FunctionalInterface
interface WordCount {
 int count(String str);
}


public class MyClassWithLambda {
 public static void main(String[] args) {
     // Lambda expression to count number of words in a string
     WordCount wc = (str) -> {
         if (str == null || str.trim().isEmpty()) {
             return 0;
         }
         return str.trim().split("\\s+").length;
     };

     String input = "Lambda expressions make Java concise and readable";
     int wordCount = wc.count(input);

     System.out.println("Input String: " + input);
     System.out.println("Word Count: " + wordCount);
 }
}

