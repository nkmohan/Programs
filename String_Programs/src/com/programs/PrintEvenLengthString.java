package com.programs;

public class PrintEvenLengthString {
	public static void main(String[] args) {
		String s1 = "Present@Iam@Staying@in@Hyderabad";
		String[] s2 = s1.split("@");
		for(String word : s2)
			if (word.length()%2==0)
				System.out.println(word);
	}

}
