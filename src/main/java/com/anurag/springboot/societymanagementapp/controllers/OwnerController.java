package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anurag.springboot.societymanagementapp.model.Owner;
import com.anurag.springboot.societymanagementapp.services.OwnerService;

import jakarta.validation.Valid;

@Controller
public class OwnerController {

    @Autowired
    private OwnerService service;

    @GetMapping(value = "/list-owners")
    public String listOwnersPage(ModelMap model, @RequestParam int fl_no){
        model.addAttribute("fl_no", fl_no);
        model.addAttribute("owners", service.getOwners(fl_no));
        return "list-owners";
    }

    @GetMapping(value = "/add-owner")
    public String showAddOwnersPage(@RequestParam int fl_no, ModelMap model){
        model.addAttribute("owner", new Owner());
        return "owners";
    }

    @PostMapping(value = "/add-owner")
    public String handleAddOwner(@Valid @ModelAttribute("owner") Owner owner, BindingResult result, @RequestParam int fl_no){
        if(result.hasErrors()){
            return "owners";
        }
        service.addOwner(owner, fl_no);
        return "redirect:list-owners?fl_no="+fl_no;
    }

    @GetMapping(value = "/update-owner")
    public String showUpdateOwnersPage(ModelMap model, @RequestParam int owner_id){
        Owner owner = service.getOneOwner(owner_id);
        model.addAttribute("owner", owner);
        return "owners";
    }

    @PostMapping(value = "/update-owner")
    public String handleUpdateOwner(@Valid @ModelAttribute("owner") Owner owner, BindingResult result){
        if(result.hasErrors()){
            return "owners";
        }
        service.updateOwner(owner);
        return "redirect:list-flats";
    }

    @GetMapping(value = "/delete-owner")
    public String deleteOwner(@RequestParam int fl_no, @RequestParam int owner_id){
        service.deleteOwner(owner_id, fl_no);
        return "redirect:list-owners?fl_no="+fl_no;
    }
}
