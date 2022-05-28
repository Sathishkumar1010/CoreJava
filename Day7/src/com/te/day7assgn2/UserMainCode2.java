package com.te.day7assgn2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserMainCode2 {
public static List<String> matchCharacter(List<String> list1){
	List<String> list2=new ArrayList<String>();
	Object[] obj= list1.toArray();
	String[] arr=Arrays.asList(obj).toArray(new String[0]);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i].charAt(0)=='a'|| arr[i].charAt(0)=='e' ||arr[i].charAt(0)=='i'||arr[i].charAt(0)=='o'||arr[i].charAt(0)=='u')
		{
			if(arr[i].charAt(arr[i].length()-1)=='a' ||arr[i].charAt(arr[i].length()-1)=='e'||arr[i].charAt(arr[i].length()-1)=='i'||arr[i].charAt(arr[i].length()-1)=='o'||arr[i].charAt(arr[i].length()-1)=='u') {
			
			list2.add(arr[i]);
			
		}
		}
		
	}
	
	return list2;

	
}
}
