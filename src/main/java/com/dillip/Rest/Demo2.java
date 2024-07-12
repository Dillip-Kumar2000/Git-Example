package com.dillip.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo2 {
	@GetMapping("/feedback")
	public String feedBack() {
		return "This is the great platform to learn";
	}

}
