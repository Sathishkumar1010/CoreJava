package com.te.day4assgn;

public class DecimalDigit 
{
	public static String checkDigits(double val)
	{
		String str=String.valueOf(val);
		String[] arr=str.split("\\.");
		str="";
		int count=0;
			String s=arr[0];
			for(int i=0;i<s.length();i++)
			{
				count++;
			}
			str=String.valueOf(count);
			str=str+":";
			s=arr[1];
			count=0;
			for(int i=0;i<s.length();i++)
			{
				count++;
			}
			
			str=str+String.valueOf(count);
			return str;
	}

}
