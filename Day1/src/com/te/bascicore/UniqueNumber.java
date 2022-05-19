package com.te.bascicore;

public class UniqueNumber {
	static int getUnique(String num)
	{
		boolean status=true;
		char ch='0';
		for(int i=0;i<num.length();i++)
		{
			for(int j=i+1;j<num.length();j++)
			{
				if(num.charAt(i)==num.charAt(j))
				{
					status=false;
					break;
				}
			}
			if(num.charAt(0)==ch)
			{
				status=false;
				break;
			}
		}
		if(status==true)
		{
			return 1;
		}
		else
		{
			return -1;
		}
   }
	
	
}
