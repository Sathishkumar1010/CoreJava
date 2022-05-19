package com.te.bascicore;

public class OddEven {

	static int checkSum(int num)
	{
		int sum=0;
		while(num>0)
		{
			int t=num%10;
			if(t%2!=0)
			{
				sum=sum+t;
			}
			num=num/10;
		}
		if(sum%2!=0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
