package com.assignment2;

public class Palindrome {
	static int addPalindromes(int a, int b)
	{
		int sum=0;
		for(int i=a; i<=b; i++)
		{
			int reverse=0;
			int tempi=i;
			while(tempi>0)
				{
					int x=tempi%10;
					reverse = reverse*10 + x;
					tempi= tempi/10;					
				}
			if(i==reverse)
				{
					sum= sum+reverse;
				}
		}
		return sum;
	}

}
