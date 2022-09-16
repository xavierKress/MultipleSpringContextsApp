package com.example.testspringcontexts.contextConfigurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = {"com.example.testspringcontexts.webApp"})
@PropertySource("classpath:webApp.properties")
public class WebAppConfig implements WebMvcConfigurer {

}
