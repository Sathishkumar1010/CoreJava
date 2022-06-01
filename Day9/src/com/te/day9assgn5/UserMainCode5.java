package com.te.day9assgn5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UserMainCode5 {
	
	static Map<String,String> getStateId(String[] arr)
	{
		Map<String,String> map=new HashMap();
		String[] str=new String[arr.length];
		for (int i = 0; i < str.length; i++) {
			str[i]=arr[i].substring(0,3).toUpperCase();
		}
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], str[i]);
		}
		return map;
		
	}

}
