package com.cruds.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SadademoApplication {
	
	@RequestMapping("/")
	public String home() {
		return "Hello! This is your Spring Boot webapp!";
	}	

	public static void main(String[] args) {
		SpringApplication.run(SadademoApplication.class, args);
	}

}

