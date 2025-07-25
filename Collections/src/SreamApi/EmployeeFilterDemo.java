package SreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee {
    int empNo;
    String name;
    int age;
    String location;

    
    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    
    void display() {
        System.out.println("EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location);
    }
}


public class EmployeeFilterDemo {

    public static void main(String[] args) {

       
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Alice", 28, "Pune"));
        employeeList.add(new Employee(102, "Bob", 35, "Hyderabad"));
        employeeList.add(new Employee(103, "Charlie", 30, "Pune"));
        employeeList.add(new Employee(104, "David", 40, "Bangalore"));
        employeeList.add(new Employee(105, "Eve", 25, "Pune"));

        List<Employee> puneEmployees = employeeList.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        
        System.out.println("Employees located in Pune:");
        for (Employee emp : puneEmployees) {
            emp.display();
        }
    }
}

