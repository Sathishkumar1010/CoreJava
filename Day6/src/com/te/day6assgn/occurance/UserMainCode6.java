package com.te.day6assgn.occurance;

public class UserMainCode6 
{

	public static int getSubString(String str,String st)
	{
		int count=0;
		int index=0;	
		while(true)
		{
		 index=str.indexOf(st,index);
		 if(index>-1)
		 {
			 count++;
			 index=index+1;
		 }
		 else
		 {
			 break;
		 }
		 
		}
		return count;
	}
}
