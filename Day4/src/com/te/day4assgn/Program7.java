package com.te.day4assgn;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Doube Value");
		double num=scn.nextDouble();
		String str=DecimalDigit.checkDigits(num);
		System.out.println(str);

	}

}
