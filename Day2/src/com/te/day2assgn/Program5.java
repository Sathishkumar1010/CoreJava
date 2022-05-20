package com.te.day2assgn;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) 
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Lucky Number");
	int num1=scn.nextInt();
	int num2=scn.nextInt();
	int num3=scn.nextInt();
	int sum=GetLuckySum.getSum(num1,num2,num3);
	System.out.println("Sum of Lucky Numbers is : "+sum);
		
	}

}
