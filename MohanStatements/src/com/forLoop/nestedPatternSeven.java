package com.forLoop;

public class nestedPatternSeven {
	public static void main(String[] args) {
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print("  ");
			}
			for (int b=a; b<5; b++) {     // reverse pyramid
				System.out.print(a+" ");  // if a=1 then take a++
			}
			for (int b=a; b<=5; b++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
}

}
