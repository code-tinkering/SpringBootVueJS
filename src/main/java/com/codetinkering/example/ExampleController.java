package com.codetinkering.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hi";
	}
}
