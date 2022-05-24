package com.te.day5assgn.removevowels;

public class UserMainCode4
{

	public static String removeEvenVowels(String str)
	{
		char[] ch=str.toCharArray();
		String st="";
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==0)
			{
				st=st+ch[i];
				
			}
			else if(i%2!=0)
			{
				if(ch[i]!='A' && ch[i]!='a' && ch[i]!='E' && ch[i]!='e' && ch[i]!='I' && ch[i]!='i' && ch[i]!='O' && ch[i]!='o' && ch[i]!='U' && ch[i]!='u' )
				{
				
					st=st+ch[i];
				}
			}
		}
		
	
		return st;
		
	}
}
