package Lambda_Expressions;

import java.util.*;

public class OddLengthWords {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("Code");
        al.add("Lambda");
        al.add("Stream");
        al.add("Hello");
        al.add("Odd");
        al.add("Even");
        al.add("World");
        al.add("Logic");

        System.out.println("Words with odd length:");
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}

