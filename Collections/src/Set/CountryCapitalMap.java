package Set;

import java.util.*;

public class CountryCapitalMap {
    
    // Instance variable M1
    private HashMap<String, String> M1 = new HashMap<>();

    // 1. Save Country-Capital pair
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // 2. Get capital by country
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // 3. Get country by capital
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Create reverse map (Capital -> Country)
    public HashMap<String, String> reverseMap() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    // 5. Return ArrayList of countries
    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    // Main method to test
    public static void main(String[] args) {
        CountryCapitalMap map = new CountryCapitalMap();

        // Step 1: Save country-capital pairs
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");
        map.saveCountryCapital("France", "Paris");
        map.saveCountryCapital("Germany", "Berlin");

        // Step 2: Get capital of a country
        System.out.println("Capital of India: " + map.getCapital("India"));

        // Step 3: Get country from capital
        System.out.println("Country with capital Tokyo: " + map.getCountry("Tokyo"));

        // Step 4: Create and print reverse map
        HashMap<String, String> M2 = map.reverseMap();
        System.out.println("\nReversed Map (Capital -> Country):");
        for (Map.Entry<String, String> entry : M2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Step 5: Get all country names
        ArrayList<String> countries = map.getAllCountries();
        System.out.println("\nList of countries:");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}

