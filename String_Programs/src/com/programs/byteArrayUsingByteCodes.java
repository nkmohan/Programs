package com.programs;

public class byteArrayUsingByteCodes {
	public static void main(String[] args) {
		String s1 = "Hello he is my friend";
        System.out.println("String: " + s1);
        byte[] res = s1.getBytes();
        System.out.println("Byte Array:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
	}

}
