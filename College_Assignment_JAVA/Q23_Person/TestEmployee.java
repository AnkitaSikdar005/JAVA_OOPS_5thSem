// TestEmployee.java
public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Alice", 75000, 2050, "ABCDE4567");

        // Print the details of the employee
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getYearStarted());
        System.out.println(employee.getNationalInsuranceNumber());
    }
}

