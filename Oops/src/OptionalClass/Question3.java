package OptionalClass;
import java.util.Optional;

public class Question3 {

    public static void main(String[] args) {
        // Employee emp = null; // This will cause exception
        Employee emp = new Employee("Alice"); // Valid employee

        Employee opt = Optional.ofNullable(emp)
            .orElseThrow(() -> new InvalidEmployeeException("Employee not found"));
        
        opt.display();
    }
}

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

@SuppressWarnings("serial")
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}
