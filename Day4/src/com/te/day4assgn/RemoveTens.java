package com.te.day4assgn;

public class RemoveTens
{
	public static int[] remove(int[] arr)
	{
		int[] arr1=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%10!=0)
			{
				arr1[j]=arr[i];
				j++;
			}
		}
		return arr1;
		
	}

	

}
