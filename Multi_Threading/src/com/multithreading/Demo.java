package com.multithreading;

public class Demo extends Thread{
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
		System.out.println("child thread executed ::"+Thread.currentThread().getName());
		}
	}
}
