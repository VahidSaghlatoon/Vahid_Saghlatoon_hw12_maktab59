package com.vahidsaghlatoon.bankservice;

import java.util.Date;

public class AtmTransactions {
    public int transactionId ;
    public Date date ;
    public String type ;
    public double amount ;
    public double postBalance ;

    public AtmTransactions(int transactionId, Date date, String type, double amount, double postBalance) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.postBalance = postBalance;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(double postBalance) {
        this.postBalance = postBalance;
    }

    public void modifies(){}
}
