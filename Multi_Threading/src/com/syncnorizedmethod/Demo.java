package com.syncnorizedmethod;

public class Demo implements Runnable{

	public synchronized void printNums() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" => "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void run() {
		printNums();
		
	}

}
