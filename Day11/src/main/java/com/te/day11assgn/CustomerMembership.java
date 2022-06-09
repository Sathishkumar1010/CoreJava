package com.te.day11assgn;

public class CustomerMembership {

	private CustomerBean customerBean;
	private int membership_id;
	private String membership_type;
	private int visits_per_year;

	public CustomerBean getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}

	public int getMembership_id() {
		return membership_id;
	}

	public void setMembership_id(int membership_id) {
		this.membership_id = membership_id;
	}

	public String getMembership_type() {
		return membership_type;
	}

	public void setMembership_type(String membership_type) {
		this.membership_type = membership_type;
	}

	public int getVisits_per_year() {
		return visits_per_year;
	}

	public void setVisits_per_year(int visits_per_year) {
		this.visits_per_year = visits_per_year;
	}

	@Override
	public String toString() {
		return "CustomerMembership [customerBean=" + customerBean + ", membership_id=" + membership_id
				+ ", membership_type=" + membership_type + ", visits_per_year=" + visits_per_year + "]";
	}

}
