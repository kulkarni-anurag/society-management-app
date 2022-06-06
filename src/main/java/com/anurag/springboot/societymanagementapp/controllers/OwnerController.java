package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.anurag.springboot.societymanagementapp.model.Owner;

import jakarta.validation.Valid;

@Controller
public class OwnerController {

    @GetMapping(value = "/list-owners")
    public String listOwnersPage(){
        return "list-owners";
    }

    @GetMapping(value = "/add-owner")
    public String showAddOwnersPage(ModelMap model){
        model.addAttribute("owner", new Owner());
        return "owners";
    }

    @PostMapping(value = "/add-owner")
    public String handleAddOwner(@Valid @ModelAttribute("owner") Owner owner, BindingResult result){
        if(result.hasErrors()){
            return "owners";
        }
        System.out.println(owner);
        return "redirect:list-owners";
    }
}
