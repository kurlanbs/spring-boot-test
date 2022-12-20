package com.test.springboottest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World! ";
	}
}
