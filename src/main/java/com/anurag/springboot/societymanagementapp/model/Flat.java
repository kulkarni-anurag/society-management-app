package com.anurag.springboot.societymanagementapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Flat {

    @NotBlank(message = "Flat number should not be empty")
    @Size(min = 4, message = "Flat number should be min 4 characters")
    private String fl_no;
    private int rooms;
    private boolean balcony;
    private double area;

    public Flat() {
        super();
    }

    public Flat(String fl_no, int rooms, boolean balcony, double area) {
        this.fl_no = fl_no;
        this.rooms = rooms;
        this.balcony = balcony;
        this.area = area;
    }

    public String getFl_no() {
        return fl_no;
    }

    public void setFl_no(String fl_no) {
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
