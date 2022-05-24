package com.te.day5assgn.findelement;

import java.util.Arrays;

public class UserMainCode5 
{
	public static int getElementPosition(String[] arr,String str)
	{
		int position=0;
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i].charAt(0)<arr[j].charAt(0))
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(str))
			{
				position=i+1;
			}
		}
		return position;
	}

}
