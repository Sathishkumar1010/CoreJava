package com.te.day6assgn.reversespliy;

public class UserMainCode5 
{
	public static String reshape(String str,char ch)
	{
		String st="";
		String c=Character.toString(ch);
		char[] chArr=str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--)
		{
			String s=Character.toString(chArr[i]);
			st=String.join(c,st,s);
		}
		st=st.substring(1);
		return st;
		
	}

}
