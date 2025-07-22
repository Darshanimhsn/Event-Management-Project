package com.Amaze;

import java.io.ObjectInputFilter.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventManagementSpringProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(EventManagementSpringProjectApplication.class, args);
	}

}
