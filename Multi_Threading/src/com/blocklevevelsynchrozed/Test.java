package com.blocklevevelsynchrozed;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		t1.setName("Child 1");
		Thread t2 = new Thread(d);
		t2.setName("Child 2");
		t2.start();
		//t2.join();
		t1.start();
	}

}
