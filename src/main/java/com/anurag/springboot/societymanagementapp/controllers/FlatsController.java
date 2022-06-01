package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anurag.springboot.societymanagementapp.model.Flat;
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
    public String showAddFlatsPage(ModelMap model){
        model.addAttribute("flat", new Flat());
        return "flats";
    }

    @PostMapping(value = "/flats")
    public String handleAddOrUpdateFlat(@ModelAttribute("flat") Flat flat, ModelMap model){
        service.addFlat(flat);
        return "redirect:list-flats";
    }
}
