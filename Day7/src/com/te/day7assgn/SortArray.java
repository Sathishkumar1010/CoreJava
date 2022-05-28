package com.te.day7assgn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {

	public static List<Object> sortMergedArrayList(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> list3=new ArrayList();
		List<Object> list4=new ArrayList();
		List<Object> list5=new ArrayList();
		
		list3.addAll(list1);
		list3.addAll(list2);
		Object[] obj=list3.toArray();
		Arrays.sort(obj);
		list4=Arrays.asList(obj);
		for (int i = 0; i <list4.size(); i++) {
			if(i==2 || i==6 || i==8)
			{
				list5.add(list4.get(i));
			}
		}
		
		return list5;
		
	}
}
