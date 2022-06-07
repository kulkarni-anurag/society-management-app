package com.anurag.springboot.societymanagementapp.model;

import java.util.Date;

public class Notice {
    private int notice_id;
    private String description;
    private Date date;
    
    public Notice() {
        super();
    }

    public Notice(int notice_id, String description, Date date) {
        super();
        this.notice_id = notice_id;
        this.description = description;
        this.date = date;
    }

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
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
        return "Notice [notice_id=" + notice_id + ", description=" + description + ", date=" + date + "]";
    }
}
