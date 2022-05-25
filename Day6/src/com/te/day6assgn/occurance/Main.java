package com.te.day6assgn.occurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the First String");
		String first=scn.next();
		System.out.println("Enter the Second String");
		String second=scn.next();
		int count=UserMainCode6.getSubString(first,second);
		System.out.println(count);
		
		
		

	}

}
