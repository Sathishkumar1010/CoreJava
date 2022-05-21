package com.te.day3assgn;

public class GetSum {
	static int getSumOfPower(int[] a)
	{
		
		int sum=1;
		for (int i = 1; i < a.length; i++) 
		{
			int t=i;
			int power=1;
			while(t>0)
			{
			power=power*a[i];
			t--;
			}
			sum=sum+power;
		}
		return sum;
		
	}

}
