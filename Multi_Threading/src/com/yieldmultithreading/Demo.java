package com.yieldmultithreading;

public class Demo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" is executed");
			Thread.yield();
		}
		
	}

}
