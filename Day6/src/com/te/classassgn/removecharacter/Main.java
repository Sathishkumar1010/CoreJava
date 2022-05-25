package com.te.classassgn.removecharacter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.next();
		System.out.println("Enter the Character to Remove");
		char ch=scn.next().charAt(0);
		str=UserMainCode2.removeCharacter(str, ch);
		System.out.println(str);
		
		
	}

}
