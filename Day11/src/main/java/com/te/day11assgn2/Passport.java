package com.te.day11assgn2;

import java.sql.Date;
import java.time.LocalDate;

public class Passport {

	private int passport_num;
	private String date_of_issue;
	private String date_of_expiry;

	public int getPassport_num() {
		return passport_num;
	}

	public void setPassport_num(int passport_num) {
		this.passport_num = passport_num;
	}

	public String getDate_of_issue() {
		return date_of_issue;
	}

	public void setDate_of_issue(String date_of_issue) {
		this.date_of_issue = date_of_issue;
	}

	public String getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(String date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	@Override
	public String toString() {
		return "Passport [passport_num=" + passport_num + ", date_of_issue=" + date_of_issue + ", date_of_expiry="
				+ date_of_expiry + "]";
	}

}
