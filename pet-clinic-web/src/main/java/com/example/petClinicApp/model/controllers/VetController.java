package com.example.petClinicApp.model.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","vets/index","vets","/vets/index.html"})
    public String listVets()
    {
        return "vets/index";
    }
}
