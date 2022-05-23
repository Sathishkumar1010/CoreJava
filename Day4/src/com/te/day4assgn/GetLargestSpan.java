package com.te.day4assgn;

public class GetLargestSpan 
{

	public static int largeSpan(int[] arr)
	{
		int count=0;
		int diff=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					diff=j-i;
					
				}
				
			}
			
			if(diff>count)
			{
				count=diff+1;
			}
		}
		return count;
		
	}
}
