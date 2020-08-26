package com.home.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
	
	public String welcomeMessage() {
		return "Welcome in Spring MVC!!!";
	}
	
	public String welcomeMessageAgain() {
		return "Welcome againg in Spring MVC!!!";
	}

}
