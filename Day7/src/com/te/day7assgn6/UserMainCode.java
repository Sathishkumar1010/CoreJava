package com.te.day7assgn6;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	static List generateOddEvenList(List list1,List list2)
	{
		List list3=new ArrayList();
		for(int i=0;i<list1.size();i++)
		{
			if(i%2!=0)
			{
				list3.add(list1.get(i));
			}
			else
			{
				list3.add(list2.get(i));
			}
		}
		return list3;
		
				
		
	}

}
