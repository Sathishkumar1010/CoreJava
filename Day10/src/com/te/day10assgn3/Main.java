package com.te.day10assgn3;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Date in DD-MM-YYYY Format");
		String date=scn.next();
		System.out.println("Last Date of Months is :"+UserMainCode3.getLastDateOfMonth(date));

	}

}
