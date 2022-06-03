package com.te.day10assgn1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Date");
		String date=scn.next();
		String computeDate="01/01/2015";
		String status=UserMainCode1.getAge(date, computeDate);
		System.out.println(status);
		
	}

}
