package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String sayHello() {
        return "Hello from Spring Boot Service!";
    }

	public String sayCicd() {
		// TODO Auto-generated method stub
		return "Hello CI/CD Auto Deploy is Working! ";
	}
}
