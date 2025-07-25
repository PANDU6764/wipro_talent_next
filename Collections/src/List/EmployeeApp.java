package List;

import java.util.ArrayList;

class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public float getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name       : " + empName);
        System.out.println("Email      : " + email);
        System.out.println("Gender     : " + gender);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("--------------------------");
    }
}

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.getEmpId() == empId) {
                return "Pay slip for employee ID " + empId + ": ₹" + e.getSalary();
            }
        }
        return "Employee with ID " + empId + " not found.";
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Arjun", "arjun@example.com", "Male", 50000);
        Employee e2 = new Employee(102, "Priya", "priya@example.com", "Female", 60000);
        Employee e3 = new Employee(103, "Vikram", "vikram@example.com", "Male", 70000);

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("All Employees:");
        e1.getEmployeeDetails();
        e2.getEmployeeDetails();
        e3.getEmployeeDetails();

        System.out.println(db.showPaySlip(102));

        System.out.println("\nDeleting employee with ID 102...");
        boolean deleted = db.deleteEmployee(102);
        System.out.println("Deleted: " + deleted);

        System.out.println(db.showPaySlip(102));
    }
}
