package com.example.temp_devops_automation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TempDevopsAutomationApplication {

	@GetMapping
	public String message(){ return "Hello welcome to my devops ci cd and kubernetes automation"; }
	public static void main(String[] args) {
		SpringApplication.run(TempDevopsAutomationApplication.class, args);
	}

}
