package com.te.day5assign.checkchar;

public class UserMainCode2 
{
	public static String checkCharacters(String str)
	{
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			return "valid";
			
		}
		else
		{
			return "InValid";
		}
		
		}
	}

