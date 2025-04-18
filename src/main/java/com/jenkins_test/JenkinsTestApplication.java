package com.jenkins_test;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

	public static void main(String[] args) {
		System.out.println("application stated.......!");

		SpringApplication.run(JenkinsTestApplication.class, args);
	}

	@PostConstruct
	public void start(){
		System.out.println("post construct is executed....!");
		System.out.println("authenticate with app password...........!");
		System.out.println("dev, qa, prod pipeline created..........!");
		System.out.println("dev, qa, prod pipeline created once again..........!");
	}

}
