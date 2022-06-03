package com.te.day10assgn4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<String,Double> map=new HashMap();
		System.out.println("Enter the Size");
		int size=scn.nextInt();
		System.out.println("Enter the Devices and Price");
		for(int i=0;i<size;i++)
		{
			map.put(scn.next(), scn.nextDouble());
		}
		System.out.println("Enter the No of Devices");
		int num=scn.nextInt();
		System.out.println("Enter the  Devices");
		String[] str=new String[num];
		for(int i=0;i<num;i++)
		{
			str[i]=scn.next();
		}
		System.out.println("Total Price of Devices is : "+UserMainCode4.costEstimater(map, str));
	}

}
