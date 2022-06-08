package com.anurag.springboot.societymanagementapp.DAO;

import java.util.List;

import com.anurag.springboot.societymanagementapp.model.Complaint;

public interface ComplaintDAO {
    int create(Complaint complaint);
    int update(Complaint complaint);
    int delete(int id);
    List<Complaint> read();
    List<Complaint> read(boolean isResolved);
    Complaint read(int id);
}
