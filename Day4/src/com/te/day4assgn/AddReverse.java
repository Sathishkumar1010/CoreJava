package com.te.day4assgn;

public class AddReverse 
{
	public static int addAndReverse(int[] arr,int a)
	{
		int sum=0; int rev=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>a)
			{
				sum=sum+arr[i];
			}	
		}
		while(sum>0)
		{
			int t=sum%10;
			rev=rev*10+t;
			sum=sum/10;
			
		}
		return rev;
		
	}

}
