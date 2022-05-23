package com.te.day4assgn;

public class Triplets 
{
	public static boolean checkTriplets(int[] a)
	{
		boolean status=false;
		for (int i = 0; i < a.length-2; i++)
		{
			if(a[i]==a[i+1] && a[i+1]==a[i+2])
			{
				status=true;
				break;
			}
			
		}
		return status;
	}

}
