package com.te.day5assign.middlecharacter;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String value with even Length");
		String str=scn.nextLine();
		String st=UserMainCode1.getMiddleChars(str);
		System.out.println(st);
	}
	
}
