package com.programs;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a="heart";
		String b="earth";
	
		
		if(a.length()!=b.length()) {
		
			System.out.println("it is not a anagram");
		return;	
	}
    char c[]=a.toCharArray();
    char d[]=b.toCharArray();
     Arrays.sort(c);
    Arrays.sort(d);
    
    if(Arrays.equals(c, d))
    	System.out.println("it is a anagram");
    else
    	System.out.println("it is not a anagram");
	}

}
