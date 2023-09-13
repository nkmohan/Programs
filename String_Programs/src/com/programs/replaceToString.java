package com.programs;

public class replaceToString {
	public static void main(String[] args) {
		String a="hi this is jack";
		String b=a.replace("is", "a");//using .replace() METHOD
		String c=a.replaceAll("hi this is jack", " bye");//using replaceAll to replace all
		System.out.println(b);
		System.out.println(c);
	}

}
