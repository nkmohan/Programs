package com.programs;

public class countToDigits {
	public static void main(String[] args) {
		String s1 = "Account Number : 0123456789";
		int digits = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 48 && s1.charAt(i) <= 57)
            	digits++;
        }
        System.out.println("Total number of Digits = " + digits);
	}

}
