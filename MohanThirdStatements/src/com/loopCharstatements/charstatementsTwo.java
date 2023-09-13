package com.loopCharstatements;

public class charstatementsTwo {
	public static void main(String[] args) {
		char ch ='A';
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				ch='A';
				System.out.print(" ");
			}
			for (int b=a; b<=5; b++) {    
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
}


}
