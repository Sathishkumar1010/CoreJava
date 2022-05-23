package com.te.day4assgn;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		boolean status=PerfectNumber.checkPerfect(num);
		if(status==true)
			System.out.println("Given Number is Perfect Number");
		else
			System.out.println("Given Number is Not Perfect Number");
		

	}

}
