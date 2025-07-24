class Employee implements Cloneable {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + "}";
    }
}

public class EmployeeCloneTest {
    public static void main(String[] args) {
        try {
           
            Employee emp1 = new Employee("John", 101, 50000.0);

           
            Employee emp2 = (Employee) emp1.clone();

            
            emp1.setName("Alice");
            emp1.setSalary(75000.0);

            
            System.out.println("Original Employee (emp1): " + emp1);
            System.out.println("Cloned Employee   (emp2): " + emp2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}
