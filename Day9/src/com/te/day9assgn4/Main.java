package com.te.day9assgn4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
		List list=UserMainCode4.obtainDestination(map, input);
		Collections.sort(list);
		for (Object o : list) {
			System.out.println(o);
			
		}
	}

}
