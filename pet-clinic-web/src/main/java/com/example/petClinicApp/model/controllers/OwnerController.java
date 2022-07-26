package com.example.petClinicApp.model.controllers;

import com.example.petClinicApp.services.OwnerService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(@Qualifier("owners") OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","owners/index.html"})
    public String listOfOwners(Model model)
    {
        model.addAttribute("owners",ownerService.findALL());
        return "owners/index";
    }
    @RequestMapping("/owners/find")
    public String notImplemented()
    {
        return "notImplemented";
    }
}
