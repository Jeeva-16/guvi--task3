public class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    // Constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public double calculateTax() {
        // Calculate sales tax based on unit price and quantity
        return price * quantity * SALES_TAX_RATE;
    }

    // Getters and toString method for easy printing
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + pid + ", Price: " + price + ", Quantity: " + quantity;
    }


}
