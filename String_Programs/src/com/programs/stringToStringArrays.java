package com.programs;

public class stringToStringArrays {
	public static void main(String[] args) {
		String s1 = "Welcome, to, Vtalent";
		String [] s2 = s1.split(",");
		for (String s : s2) {
			System.out.println(s);
		}
	}

}
