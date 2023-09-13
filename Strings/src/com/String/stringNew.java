package com.String;

public class stringNew {
	public static void main(String[] args) {
		String s1 = "Mohan";
		String s2 = "Mohan";
		String s3 = new String("Mohan");
		if (s1==s3)
			System.out.println("same");
		else
			System.out.println("not same");
	}

}
