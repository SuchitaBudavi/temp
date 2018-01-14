package com.suchi.test.thread;

public class ThreadPoolTest implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Run of  "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ending thread "+Thread.currentThread().getName());		
	}
	
}
