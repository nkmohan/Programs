package com.blocklevevelsynchrozed;

public class Demo implements Runnable{

	@Override
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++)
				System.out.println("This is synchronized key");
		}
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" is executed");
		}
		
		
	}

}
