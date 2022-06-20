package com.example.boot.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping("/index")
    public String indexPage() {

        return "Index Page";
    }
}
