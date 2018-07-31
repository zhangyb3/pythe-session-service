package com.pythe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.pythe.*")
@ImportResource(locations = { "*/*.xml" })
public class PytheSessionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PytheSessionServiceApplication.class, args);
	}
}
