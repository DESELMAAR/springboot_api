package com.telusko2.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @RequestMapping("/register")
    public String registerPage() {
        return ("register  page");
    }
}
