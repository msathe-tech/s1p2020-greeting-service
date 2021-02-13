package com.s1p2020;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingServiceController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Greetings!";
	}
	@GetMapping("/")
	public String home() {
		return "Feb 13, 10.44am Hello World!";
	}
}
