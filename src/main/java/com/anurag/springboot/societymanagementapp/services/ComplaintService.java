package com.anurag.springboot.societymanagementapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.springboot.societymanagementapp.DAO.ComplaintDAO;
import com.anurag.springboot.societymanagementapp.model.Complaint;

@Service
public class ComplaintService {

    @Autowired
    private ComplaintDAO complaintDAO;

    public void addComplaint(Complaint complaint){
        complaintDAO.create(complaint);
    }

    public void deleteComplaint(int id){
        complaintDAO.delete(id);
    }

    public void resolveComplaint(int id){
        Complaint complaint = complaintDAO.read(id);
        complaint.setResolved(true);
        complaintDAO.update(complaint);
    }

    public List<Complaint> getResolvedComplaints(){
        return complaintDAO.read(true);
    }

    public List<Complaint> getUnResolvedComplaints(){
        return complaintDAO.read(false);
    }
}
