package com.anurag.springboot.societymanagementapp.FlatDAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.flat.Flat;

public interface FlatDAO {
    int create(Flat flat);
    int update(Flat flat);
    int delete(Flat flat);
    List<Flat> read();
}
