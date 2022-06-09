package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anurag.springboot.societymanagementapp.model.Flat;
import com.anurag.springboot.societymanagementapp.services.FlatsService;

import jakarta.validation.Valid;

@Controller
public class FlatsController {

    @Autowired
    private FlatsService service;

    @GetMapping(value = "/list-flats")
    public String listFlats(ModelMap model){
        model.addAttribute("flats", service.getAllFlats());
        return "list-flats";
    }

    @GetMapping(value = "/add-flat")
    public String showAddFlatsPage(ModelMap model){
        model.addAttribute("flat", new Flat());
        return "flats";
    }

    @PostMapping(value = "/add-flat")
    public String handleAddFlat(@Valid @ModelAttribute("flat") Flat flat, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "flats";
        }
        service.addFlat(flat);
        return "redirect:list-flats";
    }

    @GetMapping(value = "/update-flat")
    public String showUpdateFlatsPage(ModelMap model, @RequestParam int fl_no){
        model.addAttribute("flat", service.getOneFlat(fl_no));
        return "flats";
    }

    @PostMapping(value = "/update-flat")
    public String handleUpdateFlat(@Valid @ModelAttribute("flat") Flat flat, BindingResult result, ModelMap model){
        if(result.hasErrors()){
            return "flats";
        }
        service.updateFlat(flat);
        return "redirect:list-flats";
    }

    @GetMapping(value = "/delete-flat")
    public String handleDeleteFlat(@RequestParam int fl_no){
        service.removeFlat(fl_no);
        return "redirect:list-flats";
    }
}
