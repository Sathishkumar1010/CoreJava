package com.te.day9assgn4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UserMainCode4 {
	
	static List obtainDestination(Map<String,String> map,String input)
	{
		List list=new ArrayList();
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			String value=map.get(key);
			if(value.equals(input))
			{
				list.add(key);
			}
		}
		
		
		
		return list;
		
	}

}
