package com.taosif.spring_boot_starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello world";
    }
}
