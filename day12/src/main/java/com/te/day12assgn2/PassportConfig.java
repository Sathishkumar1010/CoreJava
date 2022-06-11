package com.te.day12assgn2;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.te")
public class PassportConfig {
	
	@Bean("passport")
	public Passport getPassport() {
		return new Passport(101,LocalDate.parse("1995-10-10"),LocalDate.parse("2005-10-10"));
	}
	
	@Bean("employee")
	public Employee getEmployee() {
		return new Employee(getPassport(),101,"Sathishkumar");
	}

}
