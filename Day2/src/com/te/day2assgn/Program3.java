package com.te.day2assgn;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Nth Number");
		int num=scn.nextInt();
		int sum=AddNonPrimeNumber.addNonPrime(num);
		System.out.println("Sum of Nth Non Prime Number is :"+sum);
	}

	}


