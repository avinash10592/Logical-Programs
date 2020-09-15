package com.practice.spring_annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.practice.spring_annotations.util.MyLogger;

@Component

public class College {

	@Value("KMIT")
	private String collegeName;

	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;

	// Using Constructor Injection
	// public College(Principal principal) {
	// this.principal = principal;
	// }

	// public void setTeacher(Teacher teacher) {
	// this.teacher = teacher;
	// }
	//
	//
	// // Using Setter injection
	// public void setPrincipal(Principal principal) {
	// this.principal = principal;
	// }

	public void test() {
		principal.principalInfo();
		teacher.teach();
		MyLogger.consoleLogger.info("My college name is :" + collegeName);
		MyLogger.consoleLogger.info("testing this method");
	}

}
