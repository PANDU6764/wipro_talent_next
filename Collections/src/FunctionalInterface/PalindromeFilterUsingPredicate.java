package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeFilterUsingPredicate {

    public static void main(String[] args) {

        
        List<String> words = Arrays.asList(
                "madam", "racecar", "apple", "level", "banana",
                "civic", "hello", "radar", "world", "noon"
        );

        
        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reversed);
        };

        
        List<String> palindromes = new ArrayList<>();
        for (String word : words) {
            if (isPalindrome.test(word)) {
                palindromes.add(word);
            }
        }

        
        System.out.println("Palindromic words:");
        for (String p : palindromes) {
            System.out.println(p);
        }
    }
}

