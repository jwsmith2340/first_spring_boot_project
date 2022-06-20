package com.example.boot.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Main {

    @GetMapping("/main")
    public String main() {

        return "home";
    }
}
