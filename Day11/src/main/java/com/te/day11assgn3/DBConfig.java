package com.te.day11assgn3;

public class DBConfig {
	
	private String driver_name;
	private String url;
	private String user_name;
	private String password;
	
	
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBConfig [driver_name=" + driver_name + ", url=" + url + ", user_name=" + user_name + ", password="
				+ password + "]";
	}
	
	
	
	

}
