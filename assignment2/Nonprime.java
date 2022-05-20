package com.assignment2;

public class Nonprime {
	static int addNumbers(int n)
	{
		int sum=1, i=2;
		for(;i<=n;i++)
		{
			int x=2;
			while(x<=i/2)
			{
				if(i%x==0)
				{
					break;
				}
				x++;
			}
			if(x<=i/2)
			{
				sum= sum+i;
			}
		}
		return sum;
	}

}
