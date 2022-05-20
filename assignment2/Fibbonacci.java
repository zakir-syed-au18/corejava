package com.assignment2;

public class Fibbonacci {
	static int getSumOfNfibos(int num)
	{
		int sum=0, a=0, b=1, fib1=a+b;
		while(num>0)
			{
				sum=sum+fib1;
				a=b;
				b=fib1;
				fib1=a+b;
				num--;
			}
		return sum;
	}
}


