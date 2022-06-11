package com.te.day12assgn2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Passport passobj;
	private int empid;
	private String emp_name;
	
	@Autowired
	public Employee(Passport passobj, int empid, String emp_name) {
		super();
		this.passobj = passobj;
		this.empid = empid;
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [passobj=" + passobj + ", empid=" + empid + ", emp_name=" + emp_name + "]";
	}
	
	

}
