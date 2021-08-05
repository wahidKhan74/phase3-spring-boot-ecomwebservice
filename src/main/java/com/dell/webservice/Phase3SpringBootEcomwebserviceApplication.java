package com.dell.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phase3SpringBootEcomwebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3SpringBootEcomwebserviceApplication.class, args);
	}
	
	// @SpringBootApplication  :  It used for auto configuration of the application.
	
	// @ComponentScan :- enable the component scan on the package 
	// @EnableAutoConfiguration :- enable platform configuration
	// @Configuration :-register bean configurations	
}
