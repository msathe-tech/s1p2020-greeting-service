package com.s1p2020;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.TimeUnit;

@RestController
public class GreetingServiceController {

	@GetMapping("/greeting")
	public String greeting() {
        System.out.println("Invoked /greeting");
		return "Greetings!";
	}
	@GetMapping("/")
	public String home() {
        System.out.println("Invoked /");
       /*try { 
            TimeUnit.SECONDS.sleep(1);        
        } catch (Exception e) {}
       */
		return "Feb 16, 4.41am Hello World!";
	}
}
