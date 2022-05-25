package com.te.day6assgn.repeatchar;

public class UserMainCode7
{
	public static String repeatFirstThreeCharacters(String str,int num)
	{
		String st="";
		if(str.length()<3)
		{
			while(num>0)
			{
				st=st+str;
				num--;
			}
		}
		else
		{
			while(num>0)
			{
				st=st+str.substring(0,3);
				num--;
			}
		}
		
		return st;
		
	}

}
