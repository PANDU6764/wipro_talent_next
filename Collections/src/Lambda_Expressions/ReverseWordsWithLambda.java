package Lambda_Expressions;

import java.util.*;

public class ReverseWordsWithLambda {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("Lambda");
        al.add("Stream");
        al.add("Collections");
        al.add("ArrayList");
        al.add("HashMap");
        al.add("TreeSet");
        al.add("LinkedList");
        al.add("Vector");

        System.out.println("Original List:");
        al.forEach(word -> System.out.print(word + " "));

        System.out.println("\n\nReversed List:");
        Collections.reverse(al);  
        al.forEach(word -> System.out.print(word + " "));
    }
}

