package com.te.day2assgn;

public class SumOfSquare {
	static int squareOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int t=num%10;
			sum=sum+t*t;
			num=num/10;
		}
		
		return sum;
	}

	
}
