package com.javaPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		boolean prime = true;

		for (int i=2;i<=a.length/2;i++) {
			if (a[i]%2== 0) {
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
