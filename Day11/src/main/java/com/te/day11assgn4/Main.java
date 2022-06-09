package com.te.day11assgn4;

import java.util.Scanner;



public class Main {
	
public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Employee Details");
		Employee emp=new Employee(scn.nextInt(),scn.next(),scn.next(),scn.nextInt());
		EmployeeService empser=new EmployeeService();
		boolean result=empser.addEmployee(emp);
		if(result)
		{
			System.out.println("Employee Details Inserted");
		}
		else
		{
			System.out.println("Data Not Inserted");
		}
		
		
	}

}
