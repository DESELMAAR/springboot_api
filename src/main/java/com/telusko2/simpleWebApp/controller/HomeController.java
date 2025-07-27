package com.telusko2.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return ("homepage.html");
    }

    @RequestMapping("/about")
    public String aboutPage() {
        return ("about");
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return ("contact");
    }


}
