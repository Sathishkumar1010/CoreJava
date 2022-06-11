package com.te.day12assgn2;

import java.time.LocalDate;

public class Passport {

	private int passport_num;
	private LocalDate date_of_issue;
	private LocalDate date_of_expiry;
	
	
	public Passport(int passport_num, LocalDate date_of_issue, LocalDate date_of_expiry) {
		super();
		this.passport_num = passport_num;
		this.date_of_issue = date_of_issue;
		this.date_of_expiry = date_of_expiry;
	}


	

	@Override
	public String toString() {
		return "Passport [passport_num=" + passport_num + ", date_of_issue=" + date_of_issue + ", date_of_expiry="
				+ date_of_expiry + "]";
	}
	
	
	
}
