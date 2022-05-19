package com.te.bascicore;

public class ReverseNumber {

	static int reverseNum(int num)
	{
		int rev=0;
		while(num>0)
		{
			int t=num%10;
			rev=rev*10+t;
			num=num/10;
		}
		return rev;
		
	}
}
