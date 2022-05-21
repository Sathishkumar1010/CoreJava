package com.te.day3assgn;

import java.util.Arrays;

public class CheckLargestAmongCorner
{

	public static int largest(int[] a)
	{
		int first=a[0];
		int middle=a[a.length/2];
		int last=a[a.length-1];
		int largest;
		if(a.length<2)
		{
			return a[0];
		}
		else
		{
			if(first>middle && first>last)
			{
				return first;
			}
			else if(last>first && last>middle)
			{
				return last;
			}
			else
			{
				return middle;
			}
			
		}
		
		
		
		

		
	}
}
