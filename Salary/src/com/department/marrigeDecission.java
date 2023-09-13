package com.department;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class marrigeDecission {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		System.out.print("Enter the age of the person : ");
		String str1 = br.readLine();
		int age = Integer.parseInt (str1);
		System.out.print("Enter the salary of the person :");
		String str2 = br.readLine();
		double salary = Double.parseDouble (str2);
		if( age < 30 && salary > 100000 ) {
			System.out.println("He is eligable for marriage");
			}else {
				System.out.println("He is not eligible for marriage");
			}
	}

}
