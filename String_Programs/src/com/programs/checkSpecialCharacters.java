package com.programs;

public class checkSpecialCharacters {
	public static void main(String[] args) {
		String a="hg@!hgg%^&hjhk*&";

		int count=0;
		for(int i=0;i<a.length();i++) {

			if(!Character.isDigit(a.charAt(i)) && !Character.isLetter(a.charAt(i)) && !Character.isWhitespace(a.charAt(i)))


				count++;
		}
		if(count==0)
			System.out.println("no special characters are present");
		else
			System.out.println("special characters ="+count);


	}

}
