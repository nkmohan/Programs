package com.anomynous;

public class MyThread {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("run method () logic-1");
			}
	};t1.start();

	Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("run method () logic-2");
				
			}
	};
	Thread t2 = new Thread();
	t2.start();
	}

}
