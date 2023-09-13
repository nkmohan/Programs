package com.loopCharstatements;

public class charStatements {
	public static void main(String[] args) {
		char ch='A';
		for(int a=1; a<=5; a++) { 
			ch='A';
			for (int b=1; b<=a; b++) {
			System.out.print(ch+" ");
			ch++;
			}
			System.out.println();
		}

}
}