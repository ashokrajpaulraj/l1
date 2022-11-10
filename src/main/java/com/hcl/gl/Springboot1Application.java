package com.hcl.gl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
	
	// Configuring method has to be overridden
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(Springboot1Application.class);
    }

}
