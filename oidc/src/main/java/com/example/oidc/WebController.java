package com.example.oidc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

 
@Controller 
public class WebController {
	
	@GetMapping("/example")
	@CrossOrigin("*")
	public String index(){
		return "index";
	}
	

}
