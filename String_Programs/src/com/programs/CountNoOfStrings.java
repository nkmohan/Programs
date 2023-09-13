package com.programs;

public class CountNoOfStrings {
	public static void main(String[] args) {
		String a="ght334y5763r6nas";
		int count=0;
		for(int i=0;i<a.length();i++) 
			if(a.charAt(i)>=48 && a.charAt(i)<=57) 
			count++;
		System.out.println(count);

	}

}
