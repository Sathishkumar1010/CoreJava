package com.te.day12assgn3;

public class DBConfig {

	private String driver_name;
	private String url;
	private String user_name;
	private String password;
	public DBConfig(String driver_name, String url, String user_name, String password) {
		super();
		this.driver_name = driver_name;
		this.url = url;
		this.user_name = user_name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "DBConfig [driver_name=" + driver_name + ", url=" + url + ", user_name=" + user_name + ", password="
				+ password + "]";
	}
	
	
}
