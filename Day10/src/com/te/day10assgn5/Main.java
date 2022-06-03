package com.te.day10assgn5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		Map<String,String> map1=new LinkedHashMap();
		Map<String,Integer> map2=new LinkedHashMap();
		System.out.println("Enter the Size");
		int size=scn.nextInt();
		System.out.println("Enter the Employee Id,Dor and Price");
		for(int i=0;i<size;i++)
		{
			map1.put(scn.next(), scn.next());
			String key="";
			Iterator<String> itr=map1.keySet().iterator();
			while(itr.hasNext())
			{
			 key=itr.next();
			}
			map2.put(key, scn.nextInt());
		}
		Object[] str=UserMainCode5.calculateDiscount(map1, map2);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}
