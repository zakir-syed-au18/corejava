package com.assignment2;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n = sc.nextInt();
		int sum= Nonprime.addNumbers(n);
		System.out.println("Sum of  non prime positive numbers "+sum);
	}


}
