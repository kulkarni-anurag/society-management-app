package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.anurag.springboot.societymanagementapp.services.FlatsService;

@Controller
public class FlatsController {

    @Autowired
    private FlatsService service;

    @GetMapping(value = "/list-flats")
    public String listFlats(ModelMap model){
        model.addAttribute("flats", service.getAllFlats());
        return "list-flats";
    }

    @GetMapping(value = "/flats")
    public String showAddFlatsPage(){
        return "flats";
    }
}
