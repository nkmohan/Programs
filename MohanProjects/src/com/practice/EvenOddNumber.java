package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenOddNumber {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		if (num%2==0)
			System.out.println("it is even number");
		else
			System.out.println("it is odd number");
	}
}
