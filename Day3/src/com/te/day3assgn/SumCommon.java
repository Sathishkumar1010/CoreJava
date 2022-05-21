package com.te.day3assgn;

public class SumCommon 
{
	public static int sumElement(int[] a,int[]  b)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
				{
					sum=sum+a[i];
				}
				
			}
		}
		if(sum>0)
		return sum;
		else
			return -1;
	}

}
