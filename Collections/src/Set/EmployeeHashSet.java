package Set;


import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        
        HashSet<String> employeeNames = new HashSet<>();

        
        employeeNames.add("Alice");
        employeeNames.add("Bob");
        employeeNames.add("Charlie");
        employeeNames.add("David");
        employeeNames.add("Eva");

        
        System.out.println("Employee Names:");
        Iterator<String> iterator = employeeNames.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
