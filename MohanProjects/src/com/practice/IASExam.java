package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IASExam {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the age : ");
		String str = br.readLine();
		int age = Integer.parseInt(str);
		if(age>=21&&age<=32)
			System.out.println("Eligable");
		else
			System.out.println("Not Eligable");
		
	}

}
