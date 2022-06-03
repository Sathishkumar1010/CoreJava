package com.te.day10assgn5;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UserMainCode5 {
	
	static Object[] calculateDiscount(Map<String, String> map1,Map<String,Integer> map2)
	{
		Map<String,Integer> mp=new LinkedHashMap();
		String st="01/01/2015";
		Date d1=new Date(st);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String date1=sdf.format(d1);
		String date2="";
		Object[] str1=new Object[map1.size()];
		Object[] str2=new Object[map1.size()];
		Object[] str3=new Object[map1.size()];
		
		
		Iterator<String> itr=map1.keySet().iterator();
		Iterator<String> itr1=map2.keySet().iterator();
		while(itr.hasNext())
		{
				String key=itr.next();
				Date d2=new Date(map1.get(key));
				date2=sdf.format(d2);
				long diff=UserMainCode5.yearDiff(date2, date1);
					String key1=itr1.next();
					int val=map2.get(key1);
					if(val>=20000 && diff>=5)
					{
						mp.put(key1,(val/100*20));
					}
					if(val>=20000 && diff<5)
					{
						mp.put(key1,(val/100*10));
					}
					if(val<20000 && diff>=5)
					{
						mp.put(key1,(val/100*15));
					}
					if(diff<5 && val<20000)
					{
						mp.put(key1,val/100*5);
					}
					
				}
			
			
		
		
		System.out.println(mp);
		List list=new ArrayList(mp.keySet());
		List list1=new ArrayList(mp.values());
		
		str1= list.toArray();
		str2=list1.toArray();
		for(int i=0;i<str3.length;i++)
		{
			str3[i]=str1[i]+":"+str2[i];
		}
		return str3;
	}
	
	public static long yearDiff(String date1,String date2)
	{
		return ChronoUnit.YEARS.between(LocalDate.parse(date1), LocalDate.parse(date2));
		
	}


	

}
