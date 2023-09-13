package com.joinExample;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t1.join();
		t2.start();
	}

}
