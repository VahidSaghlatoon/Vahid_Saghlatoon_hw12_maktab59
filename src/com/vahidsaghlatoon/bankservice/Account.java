package com.vahidsaghlatoon.bankservice;

public class Account {
    private int number ;
    private double balance ;

    public Account(int number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(){}
    public void withdraw(){}
    public void createTransaction(){}
}
