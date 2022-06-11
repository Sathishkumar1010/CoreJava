package com.te.day12assgn1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

 @Configuration
 @ComponentScan("com.te")
public class CustomerConfig {
	
	@Bean("customerbean")
	public CustomerBean getCustomerBean()
	{
		return new CustomerBean(101,"Sathish","Sathishkumarkl@outlool.com",9788784147L);
	}
	
	@Bean("customerMembership")
	@Scope("prototype")
	public CustomerMembership getCustomerMembership()
	{
		return new CustomerMembership(getCustomerBean(),1,"premium",20);
	}

}
