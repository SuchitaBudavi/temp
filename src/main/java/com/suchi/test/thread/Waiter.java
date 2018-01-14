package com.suchi.test.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import javax.swing.plaf.SliderUI;

public class Waiter implements Runnable {

	Chopstick msg;
	
	Waiter(Chopstick s){
		msg = s;
	}
	
	@Override
	public void run() {		
		System.out.println("inside waiter run");
		synchronized (msg) {
			try {
			//	Thread.sleep(2000);
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting thread is notified!!");
		}
		
	}

}
