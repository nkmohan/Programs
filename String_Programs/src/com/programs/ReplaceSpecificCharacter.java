package com.programs;

public class ReplaceSpecificCharacter {
	public static void main(String[] args) {
		String a="java develaper";
	               
        
        int index = 10;
        char c = 'o';
 
        System.out.println("Original String = " + a);
  
        StringBuffer string = new StringBuffer(a);
        string.setCharAt(index, c);
  
        
        System.out.println("Modified String = " + string);

	}

}
