package com.assignment2;

import java.util.Scanner;

public class Main1 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n = sc.nextInt();
		int sum= Fibbonacci.getSumOfNfibos(n);
		System.out.println("Sum of fibbonacci series  "+sum);
	}

}
