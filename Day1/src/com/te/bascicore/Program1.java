package com.te.bascicore;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		int a=OddEven.checkSum(num);
		if(a==1)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Even");
		}
		

	}

}
