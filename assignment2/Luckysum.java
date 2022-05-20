package com.assignment2;

public class Luckysum {
	
	static int getLucky(int a,int b, int c)
	{
		int sum=a+b+c;
		if(a==13)
		{
			sum=sum-a-b;
		}
		if(b==13)
		{
			sum=sum-b-c;
		}
		if(c==13)
		{
			sum=sum-c;
		}
		if(sum>0)
			return sum;
		else
			return 0;
	}



}
