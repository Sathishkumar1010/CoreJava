package com.te.day7assgn4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserMainCode {
	public static List<String> convertToStringArray(List<String> list1){
		List<String> list2=new ArrayList();
		Object[] obj=  list1.toArray();
		Arrays.sort(obj);
		String[] arr=Arrays.asList(obj).toArray(new String[0]);
		list2=Arrays.asList(arr);
		return list2;
		
	}

}
