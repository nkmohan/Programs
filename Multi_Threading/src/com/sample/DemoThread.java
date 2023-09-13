package com.sample;

public class DemoThread implements Runnable{

	@Override
	public void run() {
		System.out.println("child execution started");
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+"is executed");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
