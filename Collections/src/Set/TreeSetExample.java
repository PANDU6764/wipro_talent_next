package Set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        
        TreeSet<String> countries = new TreeSet<>();

        
        countries.add("India");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Canada");
        countries.add("Australia");

        
        System.out.println("Reversed TreeSet:");
        NavigableSet<String> reversed = countries.descendingSet();
        for (String country : reversed) {
            System.out.println(country);
        }

        
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        String search = "India";
        if (countries.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}

