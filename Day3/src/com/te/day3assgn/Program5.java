package com.te.day3assgn;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		System.out.println("Enter the value for First Array");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=scn.nextInt();
			
		}
		System.out.println("Enter the value for Second Array");
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=scn.nextInt();
			
		}
		int sum=SumCommon.sumElement(arr1, arr2);
		System.out.println("Sum of Common Elements in 2 Arrays is: "+sum);
		
		

	}

}
