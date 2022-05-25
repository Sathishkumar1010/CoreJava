package com.te.day6assgn.reversespliy;

import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.next();
		System.out.println("Enter the Character");
		char ch=scn.next().charAt(0);
		String st=UserMainCode5.reshape(str,ch);
		System.out.println(st);
		
	}

}
