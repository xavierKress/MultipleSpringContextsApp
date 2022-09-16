package com.example.testspringcontexts.contextConfigurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.testspringcontexts.commonServices")
@EnableAutoConfiguration
public class ParentConfig {
}
