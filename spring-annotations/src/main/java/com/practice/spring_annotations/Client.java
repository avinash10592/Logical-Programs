package com.practice.spring_annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.spring_annotations.util.MyLogger;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		MyLogger.consoleLogger.info("The college object created by Spring is : " + college);
		college.test();
		context.close();

	}
}
