package com.cz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.cz.controller","com.cz.task"})
@EnableScheduling
public class Appaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Appaction.class, args);
	}

}
