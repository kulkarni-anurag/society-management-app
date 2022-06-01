package com.anurag.springboot.societymanagementapp.flat;

public class Flat {
    private String flat_number;
    private int rooms;
    private boolean balcony;
    private double area;

    public String getFlat_number() {
        return flat_number;
    }

    public void setFlat_number(String flat_number) {
        this.flat_number = flat_number;
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
        return "Flat [flat_number=" + flat_number + ", rooms=" + rooms + ", balcony=" + balcony + ", area=" + area + "]";
    }
}
