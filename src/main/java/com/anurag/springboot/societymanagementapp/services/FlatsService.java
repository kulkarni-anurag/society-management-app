package com.anurag.springboot.societymanagementapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.springboot.societymanagementapp.DAO.FlatDAO;
import com.anurag.springboot.societymanagementapp.model.Flat;

@Service
public class FlatsService {

    @Autowired
    private FlatDAO flatDao;

    public List<Flat> getAllFlats(){
        return flatDao.read();
    }

    public Flat getOneFlat(int fl_no){
        return flatDao.read(fl_no);
    }

    public void addFlat(Flat flat){
        flatDao.create(flat);
    }

    public void updateFlat(Flat flat){
        flatDao.update(flat);
    }

    public void removeFlat(int fl_no){
        flatDao.delete(fl_no);
    }
}
