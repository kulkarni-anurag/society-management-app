package com.anurag.springboot.societymanagementapp.DAO;

public interface FlatOwnerDAO {
    int create(int fl_no, int owner_id);
    int delete(int fl_no, int owner_id);
}
