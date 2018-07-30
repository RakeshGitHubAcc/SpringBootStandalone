package com.delta.ecoupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.ecoupon.service.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@GetMapping("/hello")
	public String sayHello() {
		return helloService.hello();
	}

}
