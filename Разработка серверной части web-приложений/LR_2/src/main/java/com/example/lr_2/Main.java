package com.example.lr_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {
    @GetMapping("/qwer")
    @ResponseBody
    public String tmp(){
        return "zxc";
    }
}
