package Assignments.Assignment_8;

public class CalculatorSimulator {
    public static void main(String[] args) {
        TaxCalculator tc = new TaxCalculator();
        double tax = tc.calculateTax("Praveen", true, 55000);
        System.out.println(tax);
    }
}
