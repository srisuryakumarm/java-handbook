package oop;

public class StandardTaxCalculator implements TaxCalculator {
    private static final double TAX_RATE = 0.20;

    @Override
    public double calculateTax(double intrest){
        return intrest * TAX_RATE;
    }
}
