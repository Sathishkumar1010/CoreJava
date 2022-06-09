package com.te.day11assgn2;

public class Employee {
	
	private Passport passobj;
	private int empid;
	private String emp_name;
	public Passport getPassobj() {
		return passobj;
	}
	public void setPassobj(Passport passobj) {
		this.passobj = passobj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [passobj=" + passobj + ", empid=" + empid + ", emp_name=" + emp_name + "]";
	}
	
	

}
