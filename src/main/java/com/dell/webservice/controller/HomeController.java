package com.dell.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
//	@RequestMapping(value = "/",method = RequestMethod.GET)
	@GetMapping("/")
	public String indexMapper() {
		return "Spring application server is up and running!";
	}
	
	@GetMapping("/hello")
	public String helloMapper() {
		return "Hello, to spring boot world";
	}
	
	@GetMapping("/hi")
	public String hiMapper() {
		return "Hi, to spring boot world";
	}
	
	@GetMapping("/greeting")
	public String greetingMapper() {
		return "Today is a wonderfull day!";
	}
}
