package com.te.day4assgn;

public class OddElements 
{

	public static int sumElements(int[] a)
	{
		int count=0;
		int sum=0;
		int[] b=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{ 
			
			if(a[i]%2!=0)
			{
				count++;
			}	
		}
		for (int i = 0; i < a.length-1; i++) 
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[i]=0;
				}
			}
			
		}
		for(int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		if(count==a.length)
		{
		return -1;
		}
		else
		{
			return sum;
		}
		
	}
}
