package com.arul;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	@RequestMapping("/")  
    public String display() {
		 return "index";
    	
	} 
	@RequestMapping("/hello")  
    public String displayHello() {
		 return "helloWorld";
    	
	}  
}
	

