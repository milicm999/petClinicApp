package com.example.petClinicApp.model.controllers;

import com.example.petClinicApp.services.OwnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners","/owners/index","owners/index.html"})
    public String listOfOwners(Model model)
    {
        log.debug("Loading List of Owners");
        model.addAttribute("owners",ownerService.findALL());
        return "owners/index";
    }
    @RequestMapping("/owners/find")
    public String notImplemented()
    {
        log.debug("Loading error owner page");
        return "notImplemented";
    }
}
