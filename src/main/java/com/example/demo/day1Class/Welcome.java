package com.example.demo.day1Class;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("aa")
	
	public String display() {
		return "Welcome Solider";
	}
}
