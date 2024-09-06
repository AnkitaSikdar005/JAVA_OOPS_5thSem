// Employee.java
public class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // Call the constructor of the superclass (Person)
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getter and Setter for annualSalary
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    // Getter and Setter for yearStarted
    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    // Getter and Setter for nationalInsuranceNumber
    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}
