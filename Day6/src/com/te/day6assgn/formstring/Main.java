package com.te.day6assgn.formstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.next();
		}
		System.out.println("Enter the Nth Number");
		int num=scn.nextInt();
		String str=UserMainCode8.formString(arr, num);
		System.out.println(str);
		
	}

}
