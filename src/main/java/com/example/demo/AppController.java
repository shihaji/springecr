package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("home")
	public String getHome() {
		
		return "hello world again botree";
	}
	
	@GetMapping("health")
	public ResponseEntity<String> getHealth() {
		
		return new ResponseEntity<>("ok",HttpStatus.OK);
	}
	
	

}
