package com.te.day2assgn;

public class SumOfFiboSeries 
{
static int addfibo(int num)
{
	int sum=0;
	int fib1=0;
	int fib2=1;
	int fib3=fib1+fib2;
	while(num>0)
	{
		sum=sum+fib1;
		fib1=fib2;
		fib2=fib3;
		fib3=fib1+fib2;
		num--;
	}
	
	return sum;
}
}
