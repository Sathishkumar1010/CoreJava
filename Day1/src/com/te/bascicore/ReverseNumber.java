package com.te.bascicore;

public class ReverseNumber {

	static String reverseNum(int num)
	{
		String rev="";
		while(num> 0)
		{
			int t=num%10;
			rev=rev+t;
			num=num/10;
		}
		return rev;
		
	}
}
