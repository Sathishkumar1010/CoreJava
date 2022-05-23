package com.te.day4assgn;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[6];
		System.out.println("Enter the Elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("Enter the Number to Check");
		int a=scn.nextInt();
		int reverse=AddReverse.addAndReverse(arr, a);
		System.out.println("Reverse Number is "+reverse);

	}

}
