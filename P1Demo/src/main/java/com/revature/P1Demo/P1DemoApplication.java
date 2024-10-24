package com.revature.P1Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan("com.revature.models") //This tells Spring Boot to look in the models package for DB entities
public class P1DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(P1DemoApplication.class, args);
	}

}
