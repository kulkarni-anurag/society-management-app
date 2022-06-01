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
}
