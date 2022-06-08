package com.anurag.springboot.societymanagementapp.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Complaint {
    private int id;

    @Min(value = 101L, message = "Flat number should be at least 101")
    private int fl_no;

    @Size(min = 10, message = "Description should be at least 10 characters")
    private String description;
    private boolean isResolved;

    public Complaint() {
        super();
    }

    public Complaint(int id, int fl_no, String description, boolean isResolved) {
        super();
        this.id = id;
        this.fl_no = fl_no;
        this.description = description;
        this.isResolved = isResolved;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFl_no() {
        return fl_no;
    }

    public void setFl_no(int fl_no) {
        this.fl_no = fl_no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return isResolved;
    }
    
    public void setResolved(boolean isResolved) {
        this.isResolved = isResolved;
    }

    @Override
    public String toString() {
        return "Complaints [id=" + id + ", fl_no=" + fl_no + ", description=" + description + ", isDone=" + isResolved + "]";
    }
}
