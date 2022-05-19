package com.te.bascicore;

public class SquareOf {
	static int sumOfSquaresOfEvenDigits(int num)
	{
		int square=0;
		while(num>0)
		{
			int t=num%10;
			if(num%2==0)
			{
			square=square+t*t;
			}
			num=num/10;
		}
		return square;
	}


}
