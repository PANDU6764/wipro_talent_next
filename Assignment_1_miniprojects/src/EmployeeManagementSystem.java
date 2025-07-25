import java.io.*;
import java.util.*;

class Employee {
    int id;
    String name;
    int age;
    double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }

    public String toFileString() {
        return id + "," + name + "," + age + "," + salary;
    }

    public static Employee fromFileString(String line) {
        String[] parts = line.split(",");
        return new Employee(
            Integer.parseInt(parts[0]),
            parts[1],
            Integer.parseInt(parts[2]),
            Double.parseDouble(parts[3])
        );
    }
}

public class EmployeeManagementSystem {
    static final String FILE_NAME = "employees.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("-----");
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);
    }

    public static void addEmployee() {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, age, salary);
            bw.write(emp.toFileString());
            bw.newLine();

            System.out.println("Employee added successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void displayAll() {
        System.out.println("----");
        System.out.println("Report");
        System.out.println("-----");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                Employee emp = Employee.fromFileString(line);
                System.out.println(emp);
                count++;
            }
            if (count == 0) {
                System.out.println("No employee records found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No data file found yet.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        System.out.println("-----");
        System.out.println("End of Report");
    }
}
