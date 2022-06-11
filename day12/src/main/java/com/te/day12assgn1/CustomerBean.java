package com.te.day12assgn1;

public class CustomerBean {
	
	private int customer_id;
	private String customer_name;
	private String customer_email;
	private long contact_no;
	
	
	public CustomerBean(int customer_id, String customer_name, String customer_email, long contact_no) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.contact_no = contact_no;
	}


	

	@Override
	public String toString() {
		return "CustomerBean [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_email="
				+ customer_email + ", contact_no=" + contact_no + "]";
	}

}
