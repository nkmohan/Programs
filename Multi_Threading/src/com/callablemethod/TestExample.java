package com.callablemethod;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestExample implements Callable{
	
	public Object call() throws Exception{
		System.out.println("call() - method executed");
		return "success";
	}
	
	public static <T> void main(String[] args) throws Exception {
		TestExample d = new TestExample();
		
		ExecutorService exService = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=15;i++) {
			Future sumbit = exService.submit(d);
			System.out.println(exService);
		}
		exService.shutdown();
	}

}
