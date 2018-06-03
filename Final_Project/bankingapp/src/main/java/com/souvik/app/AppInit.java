package com.souvik.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.souvik")
public class AppInit {

	public static void main(String[] args) {
			
		SpringApplication.run(AppInit.class, args);
	}

}
