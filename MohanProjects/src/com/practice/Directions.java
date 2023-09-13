package com.practice;

import java.io.*;

public class Directions {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the division number : ");
		String str = br.readLine();
		int no = Integer.parseInt(str);
		if(no == 1) {
			System.out.println("east");
		}else if(no == 2) {
			System.out.println("west");
		}else if(no == 3) {
			System.out.println("north");
		}else if(no == 4) {
			System.out.println("south");
		}else if(no==5) {
			System.out.println("north east");
		}else
			System.out.println("Invalid");

	}




}
