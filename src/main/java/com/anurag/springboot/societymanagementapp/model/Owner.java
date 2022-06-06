package com.anurag.springboot.societymanagementapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Owner {
    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 4, message = "Name should be at least 4 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Size(min = 4, message = "Email should be at least 4 characters")
    private String email;

    @NotBlank(message = "Mobile is required")
    @Size(min = 10, message = "Mobile number should be 10 digits")
    private String mobile;

    public Owner() {
        super();
    }

    public Owner(int id, String name, String email, String mobile) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Owner [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
    }
}
