package com.te.bascicore;

public class CountSeven {
	static int Count(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='7')
			{
				count++;
			}
		}
		
		return count;
	}
	

}
