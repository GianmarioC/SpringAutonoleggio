package com.gruppo1.noleggio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/ciao")
    public String home() {
        return "index"; 
    }
}