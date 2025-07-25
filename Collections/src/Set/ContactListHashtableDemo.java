package Set;

import java.util.*;

public class ContactListHashtableDemo {
    public static void main(String[] args) {
        
        Hashtable<String, Integer> contactList = new Hashtable<>();

        
        contactList.put("Alice", 987654321);
        contactList.put("Bob", 912345678);
        contactList.put("Charlie", 998877665);
        contactList.put("Daisy", 900112233);

        
        String checkName = "Charlie";
        if (contactList.containsKey(checkName)) {
            System.out.println("Contact \"" + checkName + "\" exists with number: " + contactList.get(checkName));
        } else {
            System.out.println("Contact \"" + checkName + "\" does not exist.");
        }

        
        int checkNumber = 900112233;
        if (contactList.containsValue(checkNumber)) {
            System.out.println("Phone number \"" + checkNumber + "\" exists in the contact list.");
        } else {
            System.out.println("Phone number \"" + checkNumber + "\" does not exist in the contact list.");
        }

        
        System.out.println("\nAll Contacts in the ContactList:");

        Set<Map.Entry<String, Integer>> entrySet = contactList.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Phone: " + entry.getValue());
        }
    }
}
