package com.te.day5assgn.removevowels;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		String st=UserMainCode4.removeEvenVowels(str);
		System.out.println(st);

	}

}
