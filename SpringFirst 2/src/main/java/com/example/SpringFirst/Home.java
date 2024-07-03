package com.example.SpringFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") -->(For Constructor to print multiple times as mentioned)
public class Home {

    private String owner;
    private int door;
    @Autowired
    @Qualifier("abc")
private InternetConnection modem;
    public Home(){
        System.out.println("home");
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
    public void connect(){
        modem.switchOn();
        System.out.println("Connecting to internet");
    }
}
