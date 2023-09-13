package com.String;

public class equalString {
	public static void main(String[] args) {
		String s1 = "visakhapatnam";
		String s2 = "visakhapatnam";
		String s3 = new String("visakhapatnam");  //hashcode
		//System.out.println(s1==s3);
		//if (s1==s2)
		if (s1.equals(s3))
			System.out.println("Both are same");
		else
			System.out.println("Both are different");
		System.out.println("");
	}

}