package com.programs;

public class ReplaceCharAtSpecificIndex {
	public static void main(String[] args) {
		String s = "What it your name?";
		int index = 6;
		char ch = 's';
		System.out.println(s.substring(0, index) + ch + s.substring(index+1));
	}

}
