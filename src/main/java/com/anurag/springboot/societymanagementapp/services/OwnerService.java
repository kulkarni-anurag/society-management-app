package com.anurag.springboot.societymanagementapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.springboot.societymanagementapp.DAO.FlatOwnerDAO;
import com.anurag.springboot.societymanagementapp.DAO.OwnerDAO;
import com.anurag.springboot.societymanagementapp.model.Owner;

@Service
public class OwnerService {

    @Autowired
    private OwnerDAO ownerDAO;

    @Autowired
    private FlatOwnerDAO flatOwnerDAO;

    public void addOwner(Owner owner, int fl_no){
        ownerDAO.create(owner);
        Owner getNewOwner = ownerDAO.read(owner.getEmail());
        flatOwnerDAO.create(fl_no, getNewOwner.getOwner_id());
    }

    public void deleteOwner(Owner owner, int fl_no){
        ownerDAO.delete(owner.getOwner_id());
        flatOwnerDAO.delete(fl_no, owner.getOwner_id());
    }

    public List<Owner> getOwners(int fl_no){
        return ownerDAO.readSome(fl_no);
    }
}
