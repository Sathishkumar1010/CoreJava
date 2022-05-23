package com.te.day4assgn;

import java.util.Arrays;

public class MedianCalc 
{
	public static int median(int[] arr)
	{
		int avg=0;
		double a=0.0;
		int sum=0;
		Arrays.sort(arr);
		if(arr.length%2!=0)
		{
			return arr[arr.length/2];
		}
		else
		{
			sum=arr[arr.length/2]+arr[arr.length/2-1];
			avg=sum/2;
			int val = (int)Math.round(avg);
			
			return val;
		}
	
		
	}

}
