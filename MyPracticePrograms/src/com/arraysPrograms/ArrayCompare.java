package com.arraysPrograms;

public class ArrayCompare {
	public static void main(String[] args) {

		int a1[] = { 12, 34, 56, 78, 90 };
		int b1[] = { 33, 63, 87, 23, 34 };
		int c1[] = { 12, 34, 56, 78, 90 };
		int d1[] = a1;

		// In objects == compares adresses only
		// In Strings == compares content of strings

		if (a1 == b1) {
			System.out.println("a1 and b1 are same");
		} else {
			System.out.println("a1 and b1 are not same");
		}
		if (a1 == c1) {
			System.out.println("a1 and c1 are same");
		} else {
			System.out.println("a1 and c1 are not same");
		}
		if (a1 == d1) {
			System.out.println("a1 and d1 are same");
		} else {
			System.out.println("a1 and d1 are not same");

		}
	}

}
