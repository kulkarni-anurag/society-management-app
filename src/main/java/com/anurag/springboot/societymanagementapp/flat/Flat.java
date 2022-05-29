package com.anurag.springboot.societymanagementapp.flat;

public class Flat {
    private int number;
    private String wing;
    private int rooms;
    private boolean balcony;
    private double area;

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

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public double getArea() {
        return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Flat [number=" + number + ", wing=" + wing + ", rooms=" + rooms + ", balcony=" + balcony + ", area=" + area + "]";
    }
}
