package com.setupmultithreading;

import com.multithreading.Demo;

public class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setPriority(5);
		Thread t1 = new Thread(d);
		t1.setPriority(10);
		Thread t2 = new Thread(d);
		t2.setPriority(6);
		Thread t3 = new Thread(d);
		t3.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread executed ::"+Thread.currentThread().getName());
		}
	}

}
