package com.te.day2assgn;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enther The Range Values");
		int start=scn.nextInt();
		int end=scn.nextInt();
		int sum=AddPalindrome.sumPalindrome(start, end);
		System.out.println("Sum of Palindrome"+sum);

	}

}
