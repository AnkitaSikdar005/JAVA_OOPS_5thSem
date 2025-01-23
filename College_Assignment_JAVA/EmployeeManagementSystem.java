// Base Class: Employee
class Employee {
    protected int employeeId;
    protected String name;
    protected double salary;

    // Parameterized Constructor
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    // Method to calculate a fixed bonus (5% of salary)
    public double calculateBonus() {
        return 0.05 * salary;
    }
}

// Derived Class: Manager
class Manager extends Employee {
    private int teamSize;
    private String department;

    // Parameterized Constructor
    public Manager(int employeeId, String name, double salary, int teamSize, String department) {
        super(employeeId, name, salary); // Call the parent class constructor
        this.teamSize = teamSize;
        this.department = department;
    }

    // Overloading calculateBonus() to include performance score
    public double calculateBonus(int performanceScore) {
        if (performanceScore > 8) {
            return 0.10 * salary; // 10% bonus for high performance
        } else {
            return 0.07 * salary; // 7% bonus for average/low performance
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class displayDetails
        System.out.println("Team Size: " + teamSize);
        System.out.println("Department: " + department);
    }
}

// Derived Class: Engineer
class Engineer extends Employee {
    private String specialization;

    // Parameterized Constructor
    public Engineer(int employeeId, String name, double salary, String specialization) {
        super(employeeId, name, salary); // Call the parent class constructor
        this.specialization = specialization;
    }

    // Override calculateBonus() to return 6% of the salary
    @Override
    public double calculateBonus() {
        return 0.06 * salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class displayDetails
        System.out.println("Specialization: " + specialization);
    }
}

// Main Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Array of Employees
        Employee[] employees = new Employee[4];

        // Adding Manager and Engineer objects to the array
        employees[0] = new Manager(101, "Alice", 90000, 5, "HR");
        employees[1] = new Manager(102, "Bob", 95000, 8, "Finance");
        employees[2] = new Engineer(201, "Charlie", 70000, "Software Development");
        employees[3] = new Engineer(202, "Diana", 75000, "Data Science");

        // Displaying details and calculating bonuses
        for (Employee employee : employees) {
            System.out.println("--------- Employee Details ---------");
            employee.displayDetails();

            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                System.out.println("Bonus: " + manager.calculateBonus(9)); // Example performance score
            } else if (employee instanceof Engineer) {
                System.out.println("Bonus: " + employee.calculateBonus());
            }
            System.out.println();
        }
    }
}

