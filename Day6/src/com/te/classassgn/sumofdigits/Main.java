package com.te.classassgn.sumofdigits;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.next();
		int val=UserMainCode1.sumDigits(str);
		System.out.println(val);
		
	}

	
}
