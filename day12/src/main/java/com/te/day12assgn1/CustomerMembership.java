package com.te.day12assgn1;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerMembership {

	private CustomerBean customerBean;
	private int membership_id;
	private String membership_type;
	private int visits_per_year;

	@Autowired
	
	public CustomerMembership(CustomerBean customerBean, int membership_id, String membership_type,
			int visits_per_year) {
		super();
		this.customerBean = customerBean;
		this.membership_id = membership_id;
		this.membership_type = membership_type;
		this.visits_per_year = visits_per_year;
		
	}

	@Override
	public String toString() {
		return "CustomerMembership [customerBean=" + customerBean + ", membership_id=" + membership_id
				+ ", membership_type=" + membership_type + ", visits_per_year=" + visits_per_year + "]";
	}

}
