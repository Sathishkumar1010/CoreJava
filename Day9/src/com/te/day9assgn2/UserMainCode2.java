package com.te.day9assgn2;

import java.util.Iterator;
import java.util.Map;

public class UserMainCode2 {
	
	static String getCaptial(Map<String,String> map,String input)
	{
		String temp="";
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			if(key.equals(input)) 
			{
				temp=key;
			}
					
		}
		
		temp=map.get(temp)+"$"+temp;
		return temp;
		
	}

}
