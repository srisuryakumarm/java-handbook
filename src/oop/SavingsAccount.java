package oop;

public class SavingsAccount extends Account {
    private final static double INTREST_RATE = 4.0;

    public SavingsAccount(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    public double calculateIntrest(){
        return getBalance() * INTREST_RATE;
    }
}
