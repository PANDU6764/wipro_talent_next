package Set;

import java.util.HashSet;
import java.util.Iterator;

public class CountrySet {
    
    HashSet<String> H1 = new HashSet<>();

    
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    
    public String getCountry(String countryName) {
        Iterator<String> it = H1.iterator();
        while (it.hasNext()) {
            String current = it.next();
            if (current.equalsIgnoreCase(countryName)) {
                return current;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountrySet obj = new CountrySet();

        
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");

       
        System.out.println("All countries in HashSet: " + obj.H1);
        System.out.println("Searching for 'India': " + obj.getCountry("India"));
        System.out.println("Searching for 'Canada': " + obj.getCountry("Canada")); // Should return null
    }
}

