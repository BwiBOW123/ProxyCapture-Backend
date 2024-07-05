package dev.thanawat.proxycapture;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProxycaptureApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ProxycaptureApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
		ConfigurableApplicationContext ctx = app.run(args);
	}
}
