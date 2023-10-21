package com.gruppo1.noleggio.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/ciao")
    public String home() {
        return "ciaoo"; 
    }
}