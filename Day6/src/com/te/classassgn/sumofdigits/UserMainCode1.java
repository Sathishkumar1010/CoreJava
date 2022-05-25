package com.te.classassgn.sumofdigits;

public class UserMainCode1 
{

	public static int sumDigits(String str)
	{
		char[] ch=str.toCharArray();
		int sum=0;
		boolean status=true;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				status=true;
			}
			else
			{
				status=false;
			}
			if(status==true)
			{
				sum=sum+Character.getNumericValue(ch[i]);
			}
		}
		
		if(sum>0)
		{
		return sum;
		}
		else
		{
			return -1;
		}
		
	}
}
