package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}
	
	@GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "index";
	}
	
/*	
	@GetMapping(value = "/")
	public String doGetHelloWorld() {
		return "Hello World";
	}
	
	@GetMapping(value = "/demo")
	public String doGetHelloWorldDemo() {
		return "Hello World (Demo)";
	}
*/	
}
