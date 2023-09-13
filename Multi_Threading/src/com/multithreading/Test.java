package com.multithreading;

public class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread executed ::"+Thread.currentThread().getName());
		}
	}

}
