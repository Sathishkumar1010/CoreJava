package com.te.day2assgn;

public class AddNonPrimeNumber {
	static int addNonPrime(int num)
	{
		int sum=1;
		for(int i=2;i<=num;i++)
		{
			int a=2;
			while(a<=i/2)
			{
				if(i%a==0)
				{
					break;
				}
				a++;
			}
			if(a<=i/2)
			{
				sum=sum+i;
			}
			
		}
		return sum;
	}

}
