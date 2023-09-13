package com.Numbers;

import java.io.*;

public class leafYear {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the year : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		int year = Integer.parseInt(str);
		
		if(year % 4 == 0 || year % 100 == 0 || year % 400 == 0 ) {
			
			System.out.println("it is  a leap year");
			
		}else {
			
			System.out.println("it is not a leap year");
		}
		
	}

}
