package com.te.day11assgn4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class EmployeeService {
	
	public boolean addEmployee(Employee employee) {
		boolean result=false;
		Connection con=EmployeeDAO.getConnection();
		String sql="insert into employee values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,employee.getEmployee_id());
			ps.setString(2,employee.getName());
			ps.setString(3,employee.getDate_of_birth());
			ps.setInt(4, employee.getSalary());
			int row=ps.executeUpdate();
			if(row>0)
			{
				result=true;
			}
			else
			{
				result=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
	}


}
