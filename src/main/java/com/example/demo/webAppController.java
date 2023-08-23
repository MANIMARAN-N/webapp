package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webAppController {
	@GetMapping(value = "/hi")
	public String getHi() {
		return "Hello";
	}
}
