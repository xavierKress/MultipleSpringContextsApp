package com.example.testspringcontexts.commonServices;

import org.springframework.stereotype.Service;

@Service
public class greetingService {

    public String getGreeting() {
        return "Welcome User";
    }
}
