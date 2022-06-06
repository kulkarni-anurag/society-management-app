package com.anurag.springboot.societymanagementapp.DAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.model.Owner;

public interface OwnerDAO {
    int create(Owner owner);
    int update(Owner owner);
    int delete(int id);
    List<Owner> read();
    Owner read(int id);
}