package com.example.petClinicApp.model.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index()
    {
        log.debug("Loading index page");
        return "index";
    }

    @RequestMapping("/oups")
    public String oups()
    {
        log.debug("Loading error page");
        return "notImplemented";
    }
}
