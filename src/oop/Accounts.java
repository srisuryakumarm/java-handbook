package oop;

public class Accounts {
    public static void main(String[] args){
        oop.Account savingsAccount = new SavingsAccount("Alice", 1000);
        oop.Account checkingsAccount = new CheckingAccount("Bob", 1500);
        Account[] account = { savingsAccount,checkingsAccount };
        for(Account acc: account){
            System.out.println(acc.getAccountHolder() + ": interest = " + acc.calculateIntrest());
        }
    }
}