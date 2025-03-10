package com.kaven.springsecurityjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public String home() {
        return "home";  // This will map to home.jsp
    }

    @GetMapping("login")
    public String loginPage() {
        return "login";  // This will map to login.jsp
    }
}


