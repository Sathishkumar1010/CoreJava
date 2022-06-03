package com.te.day10assgn2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Date");
		String date=scn.next();
		boolean status=UserMainCode2.isLeapYear(date);
	System.out.println(status);	
	
	}
}
