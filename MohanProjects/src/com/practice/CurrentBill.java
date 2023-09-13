package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CurrentBill {
	public static void main(String[] args) throws Exception {
		//Write a program to print final bill based on the below requirements 
       //  if the current bill value is more then 5000 provide 25% discount on the current bill and print final payable bill
        // if the current bill is less then 5000 give 10% discount and print final payable bill
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the amount : ");
		String str = br.readLine();
		int amount = Integer.parseInt(str);
		if (amount>5000) {
			int d = (amount/100)*25;
			int res = amount - d;
			System.out.println("final bill of 25% ="+res);
		}
		else if (amount<5000) {
			int e = (amount/100)*10;
			int res = amount - e;
			System.out.println("final bill of 10% ="+res);
		}
		
	}

}
