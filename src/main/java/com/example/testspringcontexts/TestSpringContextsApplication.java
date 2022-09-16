package com.example.testspringcontexts;

import com.example.testspringcontexts.contextConfigurations.WebAppConfig;
import com.example.testspringcontexts.contextConfigurations.ParentConfig;
import com.example.testspringcontexts.contextConfigurations.RestApiConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestSpringContextsApplication {

    public static void main(String[] args) {

        // https://www.baeldung.com/spring-boot-context-hierarchy

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .parent(ParentConfig.class).web(WebApplicationType.NONE)
                .child(RestApiConfig.class).web(WebApplicationType.SERVLET)
                .sibling(WebAppConfig.class).web(WebApplicationType.SERVLET)
                .logStartupInfo(false)
                .run(args);


    }

}
