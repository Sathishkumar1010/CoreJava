package com.te.bascicore;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		String a=ReverseNumber.reverseNum(num);
		System.out.println("Reverse of Number is :"+a);
	}

}
