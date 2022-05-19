package com.te.bascicore;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		String num=scn.next();
		int a=CountSeven.Count(num);
		System.out.println(a);

	}

}
