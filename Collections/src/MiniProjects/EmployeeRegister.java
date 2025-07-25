package MiniProjects;

import java.util.*;

class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    // Parameterized Constructor
    public Employee(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMobile() { return mobile; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    // Sorting by first name
    @Override
    public int compareTo(Employee other) {
        return this.firstName.compareToIgnoreCase(other.firstName);
    }
}

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        // Get number of employees
        System.out.println("Enter the Number of Employees:");
        int n = Integer.parseInt(sc.nextLine());

        // Read employee details
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String fname = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lname = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            employeeList.add(new Employee(fname, lname, mobile, email, address));
        }

        // Sort the list by first name
        Collections.sort(employeeList);

        // Print the header
        System.out.println("\nEmployee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        // Print employee details
        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    emp.getFirstName(), emp.getLastName(), emp.getMobile(), emp.getEmail(), emp.getAddress());
        }

        sc.close();
    }
}

