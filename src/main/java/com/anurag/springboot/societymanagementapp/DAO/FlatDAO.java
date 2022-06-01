package com.anurag.springboot.societymanagementapp.DAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.model.Flat;

public interface FlatDAO {
    int create(Flat flat);
    int update(Flat flat);
    int delete(String fl_no);
    List<Flat> read();
}
