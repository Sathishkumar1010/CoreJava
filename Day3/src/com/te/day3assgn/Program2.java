package com.te.day3assgn;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scn.nextInt();
			
			}
		int diff=GetDifferent.getBigDiff(arr);
		System.out.println("Different between Largest and Smallest is :"+diff);

	}

}
