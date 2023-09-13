package com.syncnorizedmethod;

import com.yieldmultithreading.Demo;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		t1.setName("Thread-1");
		t1.start();
		Thread t2 = new Thread(d);
		t2.setName("Thread-2");
		t2.start();
	}
}
