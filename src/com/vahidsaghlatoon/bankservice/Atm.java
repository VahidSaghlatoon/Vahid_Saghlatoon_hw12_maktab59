package com.vahidsaghlatoon.bankservice;

public class Atm {
    private Location location ;
    private String managedby ;

    public Atm(Location location, String managedby) {
        this.location = location;
        this.managedby = managedby;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getManagedby() {
        return managedby;
    }

    public void setManagedby(String managedby) {
        this.managedby = managedby;
    }

    public void identifies(){}
    public void transactions(){}
}
