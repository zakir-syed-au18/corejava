package com.assignment2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers :");
		int low = sc.nextInt();
		int high = sc.nextInt();
		int sum = Palindrome.addPalindromes(low, high);
		System.out.println("Sum of Palindrome is "+sum);
	}

}


