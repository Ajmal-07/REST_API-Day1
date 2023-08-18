package com.example.demo.day1Class;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color_Game {
	@Value("${col}")
	private String color;
	@GetMapping("/ex2")
	public String dis() {
		return "My favourite colour is "+color;
	}
}
