package com.te.day3assgn;

public class PrimeIndex 
{
	public static double average(int[] arr)
	{
		double sum=0.0;
		double avg=0.0;
		int count=0;
		for(int i=2;i<arr.length;i++)
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
			if(a>i/2)
			{
				sum=sum+arr[i];
				count++;
			}
		}
		
		avg=sum/count;
		return avg;
	}

}
