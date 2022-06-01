package com.anurag.springboot.societymanagementapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlatsController {

    @GetMapping(value = "/list-flats")
    public String listFlats(){
        return "list-flats";
    }

    @GetMapping(value = "/flats")
    public String showAddFlatsPage(){
        return "flats";
    }
}
