package com.te.day6assgn.repeatchar;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.next();
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		String st=UserMainCode7.repeatFirstThreeCharacters(str, num);
		System.out.println(st);
		
		
	}

}
