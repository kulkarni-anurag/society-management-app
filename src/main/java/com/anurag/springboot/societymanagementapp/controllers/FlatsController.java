package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.anurag.springboot.societymanagementapp.DAO.FlatDAO;

@Controller
public class FlatsController {

    @Autowired
    private FlatDAO flatDao;

    @GetMapping(value = "/list-flats")
    public String listFlats(ModelMap model){
        model.addAttribute("flats", flatDao.read());
        return "list-flats";
    }

    @GetMapping(value = "/flats")
    public String showAddFlatsPage(){
        return "flats";
    }
}
