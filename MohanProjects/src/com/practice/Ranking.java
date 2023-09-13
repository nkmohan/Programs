package com.practice;
import java.io.*;
public class Ranking {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the character : ");
		String str = br.readLine();
		char ch = Char.parseCharAt();
		if (grade=='A') {
			System.out.println("first rank");
		}else if(grade=='B') {
			System.out.println("second rank");
		}else if(grade=='C') {
			System.out.println("third rank");
		}else if(grade=='D') {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
