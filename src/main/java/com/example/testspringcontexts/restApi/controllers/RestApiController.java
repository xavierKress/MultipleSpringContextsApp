package com.example.testspringcontexts.restApi.controllers;


import org.springframework.web.bind.annotation.*;

@RestController
public class RestApiController {

    @GetMapping("/home")
    public String greeting() {
        return "Hello from REST API";
    }

}
