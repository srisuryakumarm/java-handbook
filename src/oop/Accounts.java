package oop;

public class Accounts {
    public static void main(String[] args){
        oop.Account savingsAccount = new SavingsAccount("Alice", 1000);
        oop.Account checkingsAccount = new CheckingAccount("Bob", 1500);

        TaxCalculator standardTax = new StandardTaxCalculator();
        TaxService taxService = new TaxService();

        double savingTax = taxService.getTaxOnIntrest(savingsAccount, standardTax);
        double checkingTax = taxService.getTaxOnIntrest(checkingsAccount, standardTax);

        System.out.println("Alice's Savings Tax: " + savingTax);
        System.out.println("Bob's Checking Tax: " + checkingTax);
    }
}