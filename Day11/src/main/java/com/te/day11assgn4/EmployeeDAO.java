package com.te.day11assgn4;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class EmployeeDAO {
	
	private static Connection con=null;
	private static Properties props=new Properties();
	
	public static Connection getConnection() {
		try {
			FileInputStream fis=new FileInputStream("db.properties");
			props.load(fis);
			//Class.forName(props.getProperty("DB_CLASS_NAME"));
			con=DriverManager.getConnection(props.getProperty("DB_URL"),props.getProperty("DB_USERNAME"),props.getProperty("DB_PASSWORD"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
		
	}

	
}
