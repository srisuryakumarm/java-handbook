package oop;

public class CheckingAccount extends Account {
    private final static double INTREST_RATE = 1.0;

    public CheckingAccount(String accountHolder, double balance){
        super(accountHolder, balance);
    }

    @Override
    public double calculateIntrest(){
        return getBalance() * INTREST_RATE;
    }
}
