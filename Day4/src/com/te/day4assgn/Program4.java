package com.te.day4assgn;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the  Array Elements");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int median=MedianCalc.median(arr);
		System.out.println(median);
	}

}
