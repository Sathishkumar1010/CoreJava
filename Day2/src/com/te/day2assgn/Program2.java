package com.te.day2assgn;

import java.util.Scanner;

public class Program2 
{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enther The Nth Number");
		int num=scn.nextInt();
		int sum=SumOfFiboSeries.addfibo(num);
		System.out.println("Sum of Nth Fibo Series is :"+sum);
	}
}
