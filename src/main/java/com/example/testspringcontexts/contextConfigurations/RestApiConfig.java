package com.example.testspringcontexts.contextConfigurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.testspringcontexts.restApi"})
@PropertySource("classpath:restApi.properties")
public class RestApiConfig implements WebMvcConfigurer {

}
