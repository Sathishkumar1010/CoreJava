package com.te.day9assgn2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Map<String,String> map=new HashMap();
		System.out.println("Enter the Size");
		int size=scn.nextInt();
		System.out.println("Enter the Details");
		for(int i=0;i<size;i++)
		{
			map.put(scn.next(), scn.next());
		}
		System.out.println("Enter the Input");
		String input=scn.next();
		System.out.println(UserMainCode2.getCaptial(map, input));
	}

}
