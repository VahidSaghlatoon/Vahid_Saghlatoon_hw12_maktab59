package com.vahidsaghlatoon.bankservice;

public class Customer {
    private String name ;
    private String address ;
    private String dob ;
    private int cardNumber ;
    private int pin ;

    public Customer(String name, String address, String dob, int cardNumber, int pin) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void verifyPassword(){}
}
