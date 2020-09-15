package com.practice.spring_annotations;

import org.springframework.stereotype.Component;

import com.practice.spring_annotations.util.MyLogger;

@Component
public class Principal {

	public void principalInfo() {
		MyLogger.consoleLogger.info("Hi I am your principal");
		MyLogger.consoleLogger.info("My name is James Bond");
	}

}
