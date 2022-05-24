package com.te.day5assign.middlecharacter;

public class UserMainCode1 
{
	public static String getMiddleChars(String str)
	{
		char ch1=str.charAt(str.length()/2-1);
		char ch2=str.charAt(str.length()/2);
		String s="";
		s=s+ch1+ch2;
		return s;
		
	}

}
