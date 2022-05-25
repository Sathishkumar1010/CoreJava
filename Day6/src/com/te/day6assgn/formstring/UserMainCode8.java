package com.te.day6assgn.formstring;

public class UserMainCode8
{

	public static String formString(String[] str,int num)
	{
		String st="";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>=num)
			{
				st=st+str[i].charAt(num-1);

			}
			else if(str[i].length()>=num-2)
			{
				st=st+"$";
			}
		}
		return st;
	}
}
