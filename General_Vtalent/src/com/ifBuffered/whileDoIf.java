package com.ifBuffered;

import java.io.*;


public class whileDoIf {
	
public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the number : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		int a = Integer.parseInt(str);
		
		System.out.println("Enter the number : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		int b = Integer.parseInt(str);
		
}

}

