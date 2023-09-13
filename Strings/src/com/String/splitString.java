package com.String;

public class splitString {
	public static void main(String[] args) {
		String s1 = "My@name@is@Mohan";
		String[] s2 = s1.split("@");
		for(String s3 : s2) {
		System.out.println(s3);
		}
	}

}
