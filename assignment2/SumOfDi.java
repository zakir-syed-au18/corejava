package com.assignment2;

public class SumOfDi {
	public static int sumOf(int num)
	{
			int sum=0;
			
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem*rem;
				num=num/10;
			}
			
			System.out.println(" sum of digits:"+sum);
			
			return sum;
			

	}
		}




