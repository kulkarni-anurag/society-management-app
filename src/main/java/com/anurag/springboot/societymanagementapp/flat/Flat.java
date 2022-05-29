package com.anurag.springboot.societymanagementapp.flat;

public class Flat {
    private int number;
    private String wing;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWing() {
        return wing;
    }
    
    public void setWing(String wing) {
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "Flat [number=" + number + ", wing=" + wing + "]";
    }
}
