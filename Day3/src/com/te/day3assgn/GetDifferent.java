package com.te.day3assgn;

import java.util.Arrays;

public class GetDifferent {
	public static int getBigDiff(int[] a)
	{
		int diff;
		Arrays.sort(a);
		if(a.length<2)
		{
			return a[0];
		}
		else
		{
			diff=a[a.length-1]-a[0];
		}
		
		return diff;
		
	}

	
}
