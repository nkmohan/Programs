package com.Numbers;

import java.io.*;

public class trueNumber {
	
	public static void main(String[] main) throws Exception {
		
		System.out.print("Enter the numbers a  : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine ( );
		
		int a = Integer.parseInt(str);
		
        System.out.print("Enter the numbers b  : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String result = br.readLine ( );
		
		int b = Integer.parseInt(result);
		
		if (a>=10 && 5<=b) {
			
			System.out.println("it is true");
			
		}else {
			
		System.out.println("it is false");
	}
		
	}

}
