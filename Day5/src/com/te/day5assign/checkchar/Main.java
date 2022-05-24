package com.te.day5assign.checkchar;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		String status=UserMainCode2.checkCharacters(str);
		System.out.println(status);
		
		
		
	}
}
