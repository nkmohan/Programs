package com.programs;

public class EqualAndCompareAndComparesto {
	public static void main(String[] args) {
				String s1 = "A";
		        String s2 = "A";
		        String s3 = "a";
		        String s4 = new String("A");
		        
		        System.out.println(s1 + " == " + s2 + ": " + (s1 == s2));
		 
		        // Compare s1 and s3
		       
		        // refer to same object in memory
		        System.out.println(s1 + " == " + s3 + ": "+ (s1 == s3));
		 
		        // Compare s2 and s3
		        
		        // refer to same object in memory
		        System.out.println(s2 + " == " + s3 + ": " + (s2 == s3));
		 
		        // Compare s1 and s4
		        //it is created in heap area 
		        // refer to different object in memory
		        System.out.println(s1 + " == " + s4 + ": "+ (s1 == s4));
	}

}
