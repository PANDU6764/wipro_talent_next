package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


class Employee {
    int id;
    String name;
    String location;
    double salary;

    
    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}


public class EmployeeLocationExtractor {

    public static void main(String[] args) {

        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "Pune", 50000));
        employees.add(new Employee(102, "Bob", "Hyderabad", 55000));
        employees.add(new Employee(103, "Charlie", "Bangalore", 60000));
        employees.add(new Employee(104, "David", "Pune", 52000));
        employees.add(new Employee(105, "Eva", "Mumbai", 58000));

        
        Function<Employee, String> getLocation = emp -> emp.location;

        
        List<String> locations = new ArrayList<>();
        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        
        System.out.println("Employee Locations:");
        for (String loc : locations) {
            System.out.println(loc);
        }
    }
}
