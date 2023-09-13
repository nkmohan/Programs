package com.practice;
import java.io.*;
public class SelectedFigures {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the value : ");
		String str = br.readLine();
		int value = Integer.parseInt(str);
		if(value==1) {
			System.out.println("triangle");
		}else if(value==2) {
			System.out.println("rectangle");
		}else if(value==3) {
			System.out.println("square");
		}else if(value==4) {
			System.out.println("circle");
		}else {
			System.out.println("invalid");
		}
	}

}
