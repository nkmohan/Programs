package com.arraysPrograms;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n = 6;
		boolean prime = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		} // end of for

		if (prime)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime number");
	} // end of main
}