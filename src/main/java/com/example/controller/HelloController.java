package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String getHelloMessage() {
		return "This is Spring boot Kubernets Jeninks and Groovy sample";
	}

}
