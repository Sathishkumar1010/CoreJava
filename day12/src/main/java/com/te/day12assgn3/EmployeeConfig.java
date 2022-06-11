package com.te.day12assgn3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.te")
public class EmployeeConfig {

	@Bean("dbconfig")
	public DBConfig getdbconfig() {
		return new DBConfig("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@localhost:1521:oracle","Sathishkumar","Sathyzu@2207");
	}
	
	@Bean("employeedao")
	public EmployeeDAO getEmployeeDAO()
	{
		return new EmployeeDAO(getdbconfig());
	}
	
}
