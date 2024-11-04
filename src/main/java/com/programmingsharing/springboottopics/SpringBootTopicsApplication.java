package com.programmingsharing.springboottopics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTopicsApplication {

	@Value("${spring.quartz.job-store-type:spring.datasource.driver-class-name}")
	private String testValueInjectTrick;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTopicsApplication.class, args);
	}

}
