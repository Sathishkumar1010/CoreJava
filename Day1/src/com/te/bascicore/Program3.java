package com.te.bascicore;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		int a=ReverseNumber.reverseNum(num);
		System.out.println("Reverse of "+num+" is :"+a);
	}

}
