package com.example.petClinicApp.model.controllers;

import com.example.petClinicApp.model.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","vets/index","vets","/vets/index.html"})
    public String listVets(Model model)
    {
        model.addAttribute("vets",vetService.findALL());
        return "vets/index";
    }
}
