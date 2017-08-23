package com.portal.tutorial.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {

    @RequestMapping("/homePage")
    public String greeting() {
    	System.out.println("Hii");
        return "homePage";
    }

}
