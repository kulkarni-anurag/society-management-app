package com.anurag.springboot.societymanagementapp.FlatDAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.flat.Flat;

public interface FlatDAO {
    int create(Flat flat);
    int delete(String flat_number);
    List<Flat> read();
}
