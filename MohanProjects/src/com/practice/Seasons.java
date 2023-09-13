package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Seasons {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the month no : ");
		String str = br.readLine();
		int no = Integer.parseInt(str);
		switch(no) {
		case 1 :
			System.out.println("summer");
			break;
		case 2 :
			System.out.println("rainy");
			break;
		case 3 :
			System.out.println("spring");
			break;
		case 4 :
			System.out.println("winter");
			break;
			default :
				System.out.println("invalid");
			
		}
	}

}
