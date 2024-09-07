import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(empId, name, salary);
        System.out.println("Income Tax for Employee: " + employee.calculateTax());

        // Input for Product
        System.out.print("Enter Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(pid, price, quantity);
        System.out.println("Sales Tax for Product: " + product.calculateTax());

        scanner.close();

    }
}
