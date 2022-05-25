package com.te.classassgn.negativestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=scn.nextLine();
		System.out.println("Enter the Word to Change");
		String st=scn.next();
		String s=UserMainCode4.negativeString(str,st);
		System.out.println(s);
		
		
	}

}
