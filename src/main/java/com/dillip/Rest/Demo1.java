package com.dillip.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {
	
	@GetMapping("/msg")
	public String welcomeMsg() {
		return "This is the first Demo Project";
	}

}
