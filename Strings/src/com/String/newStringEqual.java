package com.String;

public class newStringEqual {
	public static void main(String[] args) {
		String s1 = new String("Mohan");
		String s2 = new String("Mohan");
		//if(s1==s2)
		if(s1.equals(s2))
			System.out.println("address are same");
		else 
			System.out.println("address are not same");
	}

}
