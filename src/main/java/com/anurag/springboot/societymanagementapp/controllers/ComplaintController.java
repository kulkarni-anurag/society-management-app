package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anurag.springboot.societymanagementapp.model.Complaint;
import com.anurag.springboot.societymanagementapp.services.ComplaintService;

@Controller
public class ComplaintController {

    @Autowired
    private ComplaintService service;

    @GetMapping(value = "/list-resolved-complaints")
    public String listResolvedComplaintsPage(ModelMap model){
        model.addAttribute("status", true);
        model.addAttribute("complaints", service.getResolvedComplaints());
        return "list-complaints";
    }

    @GetMapping(value = "/list-unresolved-complaints")
    public String listUnResolvedComplaintsPage(ModelMap model){
        model.addAttribute("status", false);
        model.addAttribute("complaints", service.getUnResolvedComplaints());
        return "list-complaints";
    }

    @GetMapping(value = "/add-complaint")
    public String showAddComplaintsPage(ModelMap model){
        model.addAttribute("complaint", new Complaint());
        return "complaints";
    }

    @PostMapping(value = "/add-complaint")
    public String handleAddComplaint(@ModelAttribute("complaint") Complaint complaint, BindingResult result){
        if(result.hasErrors()){
            return "complaints";
        }
        service.addComplaint(complaint);
        return "redirect:list-unresolved-complaints";
    }

    @GetMapping(value = "/resolve")
    public String resolveComplaint(@RequestParam int id){
        service.resolveComplaint(id);
        return "redirect:list-unresolved-complaints";
    }

    @GetMapping(value = "/delete-complaint")
    public String hendleDeleteComplaints(@RequestParam int id){
        service.deleteComplaint(id);
        return "redirect:list-unresolved-complaints";
    }
}
