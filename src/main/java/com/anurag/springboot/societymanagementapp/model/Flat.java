package com.anurag.springboot.societymanagementapp.model;

import jakarta.validation.constraints.Min;

public class Flat {

    @Min(value = 101L, message = "Flat number should be at least 101")
    private int fl_no;

    @Min(value = 2L, message = "Flat should have min 2 rooms")
    private int rooms;
    private boolean balcony;

    @Min(value = 100, message = "Flat should have at least 100 sq.m area")
    private double area;

    public Flat() {
        super();
    }

    public Flat(int fl_no, int rooms, boolean balcony, double area) {
        this.fl_no = fl_no;
        this.rooms = rooms;
        this.balcony = balcony;
        this.area = area;
    }

    public int getFl_no() {
        return fl_no;
    }

    public void setFl_no(int fl_no) {
        this.fl_no = fl_no;
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
        return "Flat [flat_number=" + fl_no + ", rooms=" + rooms + ", balcony=" + balcony + ", area=" + area + "]";
    }
}
