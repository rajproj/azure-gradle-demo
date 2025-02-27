package com.manojava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzureGradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureGradleDemoApplication.class, args);
	}

	@GetMapping(value = "/message")
	public String welcomeMessage(){
		return "Welcome to spring azure demo";
	}

}
