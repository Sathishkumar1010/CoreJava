package com.te.day12assgn3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAO emp= (EmployeeDAO) context.getBean("employeedao");
		System.out.println(emp);

	}

}
