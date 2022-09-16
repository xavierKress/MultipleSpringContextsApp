package com.example.testspringcontexts.webApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {

    @GetMapping("/home")
    @ResponseBody
    public String greeting() {
        return "Hello from WebApp";
    }

}
