package com.te.day11assgn4;


import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	
	private int employee_id;
	private String name;
	private String date_of_birth;
	private int salary;

}
