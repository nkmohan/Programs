package com.programs;

public class Non_AlpharicNumeric {
	public static void main(String[] args) {
		String s1 = "My Password is : Password!123@#";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(s1);
	}

}
