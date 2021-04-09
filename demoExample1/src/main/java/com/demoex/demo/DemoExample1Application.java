package com.demoex.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoExample1Application.class, args);
	}
	
	@RestController
	static class SimpleRestController{
		@GetMapping("/")
		@CrossOrigin("*")
		public String welcomeUser() {
				//@AuthenticationPrincipal OidcUser oidcUser){
			return "Hi User. Welcome to our application ";
		//+oidcUser.getFullName()+" Welcome to demo project 1";
	}
	
	}

}
