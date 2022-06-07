package com.anurag.springboot.societymanagementapp.model;

import java.util.Date;

public class Notice {
    private int id;
    private String description;
    private Date date;
    
    public Notice() {
        super();
    }

    public Notice(int id, String description, Date date) {
        super();
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notice [id=" + id + ", description=" + description + ", date=" + date + "]";
    }
}
