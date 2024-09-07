public interface Taxable {
    // Tax rates
    double SALES_TAX_RATE = 0.07; // 7%
    double INCOME_TAX_RATE = 0.105; // 10.5%

    // Abstract method to calculate tax
    double calculateTax();

}
