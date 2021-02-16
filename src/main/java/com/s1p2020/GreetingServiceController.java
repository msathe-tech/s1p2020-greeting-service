package com.s1p2020;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.TimeUnit;

@RestController
public class GreetingServiceController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Greetings!";
	}
	@GetMapping("/")
	public String home() {
        TimeUnit.SECONDS.sleep(1);
		return "Feb 15, 6.49pm Hello World!";
	}
}
