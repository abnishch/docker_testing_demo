package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
public class HelloController {

	@Autowired HelloService helloService;
	
	@GetMapping("/hello")
    public String hello() {
        return helloService.sayHello();
    }
	@GetMapping("/cicd-test")
    public String cicd() {
        return helloService.sayCicd();
    }
}
