package com.te.day5assgn.formnew;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		System.out.println("Enter the Positive Integer");
		int num=scn.nextInt();
		String st=UserMainCode3.formNewWord(str, num);
		System.out.println(st);

	}

}
