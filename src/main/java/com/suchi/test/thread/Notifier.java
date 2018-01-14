package com.suchi.test.thread;

public class Notifier implements Runnable {

	Chopstick msg;
	
	Notifier(Chopstick s){
		msg = s;
	}
	
	@Override
	public void run() {
		System.out.println("Inside notifier run");
		synchronized(msg){
			try {
				Thread.sleep(4500);
				System.out.println("Notifing waiting threads");
				msg.notifyAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
