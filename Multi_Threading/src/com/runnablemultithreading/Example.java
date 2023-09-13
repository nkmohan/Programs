package com.runnablemultithreading;

public class Example implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("child implements "+Thread.currentThread().getName());
		}
	}

}
