package com.example.testinggithub.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/info")
    public String takeInfo(){
        return "Some info from Sony";
    }
}
