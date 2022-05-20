package com.assignment2;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = Luckysum.getLucky(a, b, c);
		System.out.println("Sum of the three using logic is "+sum);
	}

}


