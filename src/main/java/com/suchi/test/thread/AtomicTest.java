package com.suchi.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest implements Runnable{

	int count=0;
	AtomicInteger atomicCount = new AtomicInteger(0);
	
	@Override
	public void run() {
		System.out.println("In thread run");
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			atomicCount.incrementAndGet();
		}
		System.out.println("Thread run ended");
	}

	
}
