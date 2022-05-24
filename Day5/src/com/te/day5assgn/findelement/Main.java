package com.te.day5assgn.findelement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.next();
		}
		System.out.println("Enter the element to Find");
		String str=scn.next();
		int pos=UserMainCode5.getElementPosition(arr,str);
		System.out.println(pos);

	}

}
