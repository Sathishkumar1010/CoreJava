package com.te.classassgn.nameformat;

import java.util.StringTokenizer;

public class UserMainCode3 
{
	public static String nameFormat(String str)
	{
	
		String[] arr=str.split(" ");
		StringBuffer sb=new StringBuffer();
		String s1=arr[1];
		String s2=arr[0].substring(0,1);
		sb.append(s1).append(",").append(s2);
		String s=sb.toString();
	
		return s;
	}

}
