public class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateTax() {
        // Calculate income tax based on salary
        return salary * INCOME_TAX_RATE;
    }

    // Getters and toString method for easy printing
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;

    }
}
