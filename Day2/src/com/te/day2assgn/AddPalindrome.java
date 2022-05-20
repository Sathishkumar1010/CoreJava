package com.te.day2assgn;

public class AddPalindrome {
	static int sumPalindrome(int a,int b)
	{
		int i=a;
		int sum=0;
		for(;i<=b;i++)
		{
			int rev=0;
			int copy=i;
			while(copy>0)
			{
				int t=copy%10;
				rev=rev*10+t;
				copy=copy/10;
			}
			if(i==rev)
			{
				sum=sum+rev;
			}
		}
		return sum;
	}

}
