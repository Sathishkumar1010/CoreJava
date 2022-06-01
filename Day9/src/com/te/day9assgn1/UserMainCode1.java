package com.te.day9assgn1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserMainCode1 {
	static String getMaxKeyValue(Map<Integer,String> map)
	{
		int temp=0;
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			if(key>temp)
			{
				temp=key;
			}
		
		}
		return map.get(temp);
		
	}

}
