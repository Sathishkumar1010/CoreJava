package com.te.bascicore;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scn.nextInt();
		int a=SquareOf.sumOfSquaresOfEvenDigits(num);
		System.out.println("Sum of Square of Even Number is :"+a);

	}

}
