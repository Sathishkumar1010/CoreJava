package com.te.day11assgn2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("day11assgn2.xml");
		Passport p=(Passport) context.getBean("passobj");
		Employee e=(Employee) context.getBean("employee");
		System.out.println(e);
		
	}

}
