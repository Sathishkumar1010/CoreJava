package com.te.day3assgn;

import java.util.Scanner;

public class Program3 
{
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scn.nextInt();
			
			}
		int large=CheckLargestAmongCorner.largest(arr);
		System.out.println("Largest Element in the Corner of An Array is :"+large);
}
}