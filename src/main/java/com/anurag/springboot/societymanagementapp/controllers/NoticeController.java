package com.anurag.springboot.societymanagementapp.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.anurag.springboot.societymanagementapp.model.Notice;
import com.anurag.springboot.societymanagementapp.services.NoticeService;

import jakarta.validation.Valid;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService service;

    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

    @GetMapping(value = "/list-notices")
    public String listNoticesPage(ModelMap model){
        model.addAttribute("notices", service.getAllNotices());
        return "list-notices";
    }

    @GetMapping(value = "/add-notice")
    public String showAddNoticePage(ModelMap model){
        model.addAttribute("notice", new Notice());
        return "notices";
    }

    @PostMapping(value = "/add-notice")
    public String handleAddNotice(@Valid @ModelAttribute("notice") Notice notice, BindingResult result){
        if(result.hasErrors()){
            return "notices";
        }
        service.addNotice(notice);
        return "redirect:list-notices";
    }

    @GetMapping(value = "/update-notice")
    public String showUpdateNoticePage(ModelMap model, @RequestParam int notice_id){
        model.addAttribute("notice", service.getOneNotice(notice_id));
        return "notices";
    }

    @PostMapping(value = "/update-notice")
    public String handleUpdateNotice(@Valid @ModelAttribute("notice") Notice notice, BindingResult result){
        if(result.hasErrors()){
            return "notices";
        }
        service.updateNotice(notice);
        return "redirect:list-notices";
    }

    @GetMapping(value = "/delete-notice")
    public String deleteNotice(ModelMap model, @RequestParam int notice_id){
        service.deleteNotice(notice_id);
        return "redirect:list-notices";
    }
}
