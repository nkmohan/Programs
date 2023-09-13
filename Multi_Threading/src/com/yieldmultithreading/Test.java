package com.yieldmultithreading;

public class Test {
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		t1.setName("Thread1");
		t1.setPriority(7);
		Thread t2 = new Thread(d);
		t2.setName("Thread2");
		t2.setPriority(3);
		Thread t3 = new Thread(d);
		t3.setName("Thread3");
		t3.setPriority(7);
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
