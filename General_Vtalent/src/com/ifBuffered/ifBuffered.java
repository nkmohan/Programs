package com.ifBuffered;

import java.io.*;

public class ifBuffered {

public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the number : ");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		String str = br.readLine();
		
		int a = Integer.parseInt(str);
		
		if(a % 2 == 0) {    // if(a%2==1)
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd number");
		}

}
}
