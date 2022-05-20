package com.te.day2assgn;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=scn.nextInt();
		int sum=SumOfSquare.squareOfDigits(num);
		System.out.println("Sum of Square of Digit is :"+sum);

	}

}
