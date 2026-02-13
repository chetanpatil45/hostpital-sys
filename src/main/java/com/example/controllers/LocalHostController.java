package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalHostController {

    @GetMapping
    public String sayHello(){
        return "Hello world";
    }
}
