package com.suchi.test.thread;

import java.util.concurrent.Callable;

public class Addition implements Callable<Integer> {

	int a, b;
	
	Addition(int a,int b){
		this.a = a;
		this.b = b;	
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName()+" Addition "+a+" "+b);			
		return a+b;
	}	
}
