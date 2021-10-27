package com.vahidsaghlatoon.bankservice;

public class CurrentAccount extends Account{
    public CurrentAccount(int number, double balance) {
        super(number, balance);
    }

    @Override
    public void withdraw() {
        super.withdraw();
    }
}
