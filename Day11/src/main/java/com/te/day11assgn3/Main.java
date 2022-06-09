package com.te.day11assgn3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("day11assgn3.xml");
		EmployeeDAO edao=(EmployeeDAO) context.getBean("employeedao");
	System.out.println(edao);	
	
	}
}
