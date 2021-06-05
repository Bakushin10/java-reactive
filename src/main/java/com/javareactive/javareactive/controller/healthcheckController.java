package com.javareactive.javareactive.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthcheckController {

    @GetMapping("/health")
    public String healthcheck(){
        return "healthy";
    }
}
