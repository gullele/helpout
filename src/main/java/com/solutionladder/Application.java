package com.solutionladder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Spring boot class that will be triggered first.
 * This class has to extend from SpringBootServletInitializer to make it deployable to tomcat 
 * Also, in build.gradle, the providedRuntime("org.springframework.boot:spring-boot-starter-tomcat") should be added
 *
 * @author Kaleb Woldearegay <kaleb@solutionladder.com>
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
