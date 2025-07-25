package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ReverseWordsWithConsumer {

    public static void main(String[] args) {

       
        List<String> words = new ArrayList<>(Arrays.asList(
                "hello", "world", "java", "program", "language",
                "reverse", "consumer", "arraylist", "update", "stream"
        ));

        
        Consumer<Integer> reverseWordAtIndex = index -> {
            String word = words.get(index);
            String reversed = new StringBuilder(word).reverse().toString();
            words.set(index, reversed); // Update the original list
        };

        
        for (int i = 0; i < words.size(); i++) {
            reverseWordAtIndex.accept(i);
        }

        
        System.out.println("Words after reversing:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

