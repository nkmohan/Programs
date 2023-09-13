package com.programs;

import java.util.Arrays;

public class stringtointegerArray {
	public static void main(String[] args) {
		String s1 = "[1,2,356,678,3378]";
		String[] string = s1.replaceAll("\\[", "")
                .replaceAll("]", "")
                .split(",");
		int[] arr = new int[string.length];
		for (int i = 0; i < string.length; i++) {
            arr[i] = Integer.valueOf(string[i]);
        }
		System.out.print("String : " + s1);
		System.out.print("\nInteger array : "+ Arrays.toString(arr));
	}

}
