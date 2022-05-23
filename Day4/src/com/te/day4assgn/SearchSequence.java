package com.te.day4assgn;

public class SearchSequence 
{

	public static boolean checkSequnce(int[] a)
	{
		boolean status=false;
		for (int i = 0; i < a.length-2; i++)
		{
			if(a[i]==1 && a[i+1]==2 && a[i+2]==3)
			{
				status=true;
				break;
			}
			
		}
		return status;
	}

}
