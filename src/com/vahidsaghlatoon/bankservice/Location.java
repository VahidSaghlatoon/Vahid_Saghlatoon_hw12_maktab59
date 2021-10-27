package com.vahidsaghlatoon.bankservice;

public class Location {
    private int la ;
    private int lu ;

    public Location(int la, int lu) {
        this.la = la;
        this.lu = lu;
    }

    public int getLa() {
        return la;
    }

    public void setLa(int la) {
        this.la = la;
    }

    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }
}
