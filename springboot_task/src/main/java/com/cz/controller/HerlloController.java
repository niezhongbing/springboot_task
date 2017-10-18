package com.cz.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerlloController {
	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}
}
