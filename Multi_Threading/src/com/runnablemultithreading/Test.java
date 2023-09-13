package com.runnablemultithreading;

public class Test {
	public static void main(String[] args) {
		Example e = new Example();
		Thread t = new Thread(e);
		t.start();
		Thread t1 = new Thread(e);
		t.start();
		Thread t2 = new Thread(e);
		t.start();
		Thread t3 = new Thread(e);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread executed ::" + Thread.currentThread().getName());
		}
	}

}
