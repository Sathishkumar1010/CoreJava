package com.te.day3assgn;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=scn.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scn.nextInt();
			
			}
		double average=PrimeIndex.average(arr);
		System.out.println("Average of Prime Index Number is: "+average);

	}

}
