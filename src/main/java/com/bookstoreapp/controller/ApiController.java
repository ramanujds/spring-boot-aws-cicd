package com.bookstoreapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApiController {

    @GetMapping("/api")
    public String launchSwaggerUi() {
        return "redirect:/swagger-ui.html";
    }


    @GetMapping("/")
    public String showWelcomeMessage() {
        return "Welcome to Bookstore App";
    }


}
