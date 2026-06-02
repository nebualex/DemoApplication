package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	
	 @GetMapping("/hello")
	    public String home() {
		 System.out.println(" Nebu you are a genious  +++---");
		 logger.info("Processing started...");
	        logger.debug("Detailed debug info here");
	        return "Hello from Java Web App!";
	    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
