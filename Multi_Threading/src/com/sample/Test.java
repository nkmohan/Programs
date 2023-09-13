package com.sample;

public class Test {
	public static void main(String[] args) {
		DemoThread Dt = new DemoThread();
		
		Thread t = new Thread(Dt);
		t.setName("child thread");
		t.start();
		for(int i=0; i<10; i++) {
			System.out.println("main thread : "+Thread.currentThread().getName());
		}
	}

}
