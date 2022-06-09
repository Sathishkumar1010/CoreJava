package com.te.day11assgn3;

public class EmployeeDAO {
	
	private DBConfig dbconfig;

	public DBConfig getDbconfig() {
		return dbconfig;
	}

	public void setDbconfig(DBConfig dbconfig) {
		this.dbconfig = dbconfig;
	}

	@Override
	public String toString() {
		return "EmployeeDAO [dbconfig=" + dbconfig + "]";
	}
	
	

}
