package com.te.day11assgn;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("day11assgn.xml");
		CustomerBean cb=(CustomerBean) context.getBean("customerbean");
		CustomerMembership cm=(CustomerMembership) context.getBean("customermembership");	
		System.out.println(cm);
		
		
		 
	}
}
