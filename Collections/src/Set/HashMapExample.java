package Set;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        
        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("USA", "Washington DC");
        map.put("Japan", "Tokyo");
        map.put("Germany", "Berlin");

        String checkKey = "India";
        if (map.containsKey(checkKey)) {
            System.out.println("Key '" + checkKey + "' exists in the map.");
        } else {
            System.out.println("Key '" + checkKey + "' does NOT exist in the map.");
        }

        String checkValue = "Berlin";
        if (map.containsValue(checkValue)) {
            System.out.println("Value '" + checkValue + "' exists in the map.");
        } else {
            System.out.println("Value '" + checkValue + "' does NOT exist in the map.");
        }

        System.out.println("\nIterating through the map:");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

