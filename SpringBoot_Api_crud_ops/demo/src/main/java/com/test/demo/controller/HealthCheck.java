package com.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthCheck {
	
	@GetMapping("/check")
	public String show() {
		
		
		return "This is message to show 200 ok";
		
	}

}
