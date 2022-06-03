package com.te.day10assgn4;

import java.util.Iterator;
import java.util.Map;

public class UserMainCode4 {
	
	static double costEstimater(Map<String,Double
			> map,String[] str)
	{
		double totalprice=0;
		Iterator<String> itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			for(int i=0;i<str.length;i++)
			{
				if(key.equals(str[i]))
				{
					totalprice=totalprice+map.get(key);
				}
			}
			
		
		}
		
		return totalprice;
	}

}
