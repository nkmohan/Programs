package com.programs;

public class removeWordFromString {
	public static void main(String[] args) {
        String str = "This is my Text Book";
        String word = "Text";
        str = str.replaceAll("Text", "");
        str = str.trim();
        System.out.print(str);
	}

}
