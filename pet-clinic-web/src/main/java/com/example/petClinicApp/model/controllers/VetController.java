package com.example.petClinicApp.model.controllers;

import com.example.petClinicApp.services.VetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets","vets/index","vets","/vets/index.html","/vets.html"})
    public String listVets(Model model)
    {
        log.debug("Loading Vets Index page");
        model.addAttribute("vets",vetService.findALL());
        return "vets/index";
    }
}
