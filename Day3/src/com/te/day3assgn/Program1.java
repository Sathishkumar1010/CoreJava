package com.te.day3assgn;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[4];
		System.out.println("Enter the Elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scn.nextInt();
		}
		int sum=GetSum.getSumOfPower(arr);
		System.out.println(sum);
		

	}

}
