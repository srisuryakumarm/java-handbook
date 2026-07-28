package oop;

public class TaxService {
    public double getTaxOnIntrest(Account account, TaxCalculator taxCalculator){
        double intrest = account.calculateIntrest();
        return taxCalculator.calculateTax(intrest);
    }
}