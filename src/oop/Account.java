package oop;

public abstract class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    public abstract double calculateIntrest();
}