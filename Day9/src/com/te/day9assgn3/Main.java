package com.te.day9assgn3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap();
		System.out.println("Enter the Size");
		int size=scn.nextInt();
		System.out.println("Enter the Details");
		for(int i=0;i<size;i++)
		{
			map.put(scn.nextInt(), scn.nextInt());
		}
		System.out.println(UserMainCode3.getYear(map));
	}

}
