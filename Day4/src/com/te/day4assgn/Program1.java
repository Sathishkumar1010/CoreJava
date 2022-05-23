package com.te.day4assgn;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the Elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=scn.nextInt();
		}
		int[] arr1=RemoveTens.remove(arr);
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}

	}

}
