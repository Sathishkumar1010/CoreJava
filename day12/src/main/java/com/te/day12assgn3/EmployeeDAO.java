package com.te.day12assgn3;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAO {
	
	private DBConfig dbconfig;

	@Autowired
	public EmployeeDAO(DBConfig dbconfig) {
		super();
		this.dbconfig = dbconfig;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dbconfig=" + dbconfig + "]";
	}
	
	
	

}
