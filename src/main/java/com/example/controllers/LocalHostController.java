package com.example.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "HOME", description = "To test the health of application")
public class LocalHostController {

    @GetMapping
    public String sayHello(){
        return "Hello world";
    }
}
