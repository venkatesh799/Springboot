package com.venkatesh.simplewebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello ruthless";
    }

    @RequestMapping("/about")
    public String about() {
        return "about ruthless";
    }
}
