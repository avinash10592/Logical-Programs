package com.practice.spring_annotations;

import org.springframework.stereotype.Component;

import com.practice.spring_annotations.util.MyLogger;

@Component
public class MathTeacher implements Teacher {

	public void teach() {
		MyLogger.consoleLogger.info("Hi I am your MathTeacher");
		MyLogger.consoleLogger.info("My name is Riraz");

	}

}
