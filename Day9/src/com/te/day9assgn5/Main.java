package com.te.day9assgn5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of An Array");
		int size=scn.nextInt();
		String[] arr=new String[size];
		System.out.println("Enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scn.next();
		}
		Map<String,String> map=UserMainCode5.getStateId(arr);
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=map.get(key);
			System.out.print(value+":");
			System.out.println(key);	
		}
		

	}

}
