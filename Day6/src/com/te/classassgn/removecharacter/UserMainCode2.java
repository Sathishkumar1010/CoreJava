
package com.te.classassgn.removecharacter;


public class UserMainCode2 
{
	public static String removeCharacter(String str,char ch)
	{
		String s=Character.toString(ch);
		String s1=str.replace(s,"");
		
		
		return s1;
	}

}
