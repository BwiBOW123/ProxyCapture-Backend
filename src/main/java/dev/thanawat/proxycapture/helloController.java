package dev.thanawat.proxycapture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@GetMapping("/")
	public String sayhi() {
		return "Welcome to Spring Boot";
	}
	
}
