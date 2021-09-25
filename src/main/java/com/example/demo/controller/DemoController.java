package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello..!!";
    }

    @GetMapping("/anotherWelcome")
    public String anotherWelcome() {
        return "Hello World!!!";
    }
}
