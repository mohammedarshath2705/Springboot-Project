package com.example.SpringFirst;

import org.springframework.stereotype.Component;

@Component("abc")

public class InternetConnection {
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private String ipAddress;
    private int speed;


    public void switchOn(){
        System.out.println("Switching on internet");
    }
}
