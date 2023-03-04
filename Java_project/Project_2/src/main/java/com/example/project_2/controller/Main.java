package com.example.project_2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "hello_world";
    }
}
