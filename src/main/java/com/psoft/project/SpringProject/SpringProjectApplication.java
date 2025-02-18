package com.psoft.project.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//@SpringBootApplication
//public class SpringProjectApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringProjectApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class SpringProjectApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringProjectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }
}
