package com.te.day9assgn3;

import java.util.Iterator;
import java.util.Map;

public class UserMainCode3 {
	static Integer getYear(Map<Integer,Integer> map)
	{
		int temp=0;
		int temp1=0;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			int value=map.get(key);
			if(value>temp)
			{
				temp=value;
				temp1=key;
			}
		
		}
		
		return temp1;
		
		
	}

}
