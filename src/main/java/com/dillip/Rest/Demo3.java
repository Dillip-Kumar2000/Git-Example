package com.dillip.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3 {
	
	@GetMapping("/end")
	public String Home() {
		return "Get back to Home";
	}

}
