package com.switchOperators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumbers {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		boolean isPrime = true;
		if (num ==0 || num == 1 ) {
			isPrime = false;
		}
		for (int a=2; a<=num/2; a++) {
			if (num%a==0)
				isPrime = false;
			break;
		}
		if(isPrime) {
			System.out.println("It is a Prime Number");
		}else {
			System.out.println("It is not a Prime Number");
		}
	}

}
