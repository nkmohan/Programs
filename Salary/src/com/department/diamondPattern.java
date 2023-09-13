package com.department;

public class diamondPattern {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=5; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=0; k<i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int a=1; a<=5; a++) {
			for (int b=0; b<a; b++) {
				System.out.print(" ");
			}
			for (int c=(5-a)*2-1; c>0; c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
 