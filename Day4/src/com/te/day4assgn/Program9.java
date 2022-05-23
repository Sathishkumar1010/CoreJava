package com.te.day4assgn;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the  Array Elements");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int sum=OddElements.sumElements(arr);
		System.out.println("Sum of Even Elements is: "+sum);

	}

}
