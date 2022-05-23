package com.te.day4assgn;

public class PerfectNumber
{

	public static boolean checkPerfect(int num)
	{
		int a=1;
		int sum=0;
		while(a<=num/2)
		{
			if(num%a==0)
			{
				sum=sum+a;
			}
			a++;
		}
		if(num==sum)
			return true;
		else
			return false;
	}
}
