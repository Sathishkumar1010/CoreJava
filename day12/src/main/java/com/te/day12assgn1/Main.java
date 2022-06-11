package com.te.day12assgn1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerMembership cm= context.getBean(CustomerMembership.class);
		System.out.println(cm);
	
		
	}

}
