package com.te.day12assgn2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	

	ApplicationContext context = new AnnotationConfigApplicationContext(PassportConfig.class);
	Employee emp= (Employee) context.getBean("employee");
	System.out.println(emp);
}
}
