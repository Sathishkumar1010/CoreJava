package com.te.day5assgn.formnew;

public class UserMainCode3
{

	public static String formNewWord(String str,int num)
	{
		String st="";
		for(int i=0;i<num;i++)
		{
			st=st+str.charAt(i);
		}
		for(int i=str.length()-num;i<str.length();i++)
		{
			st=st+str.charAt(i);
		}
		
		return st;
		
	}
}
