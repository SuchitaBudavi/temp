package com.suchi.test.thread;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{

	BlockingQueue<Message> que;
	
	Producer(BlockingQueue<Message> q){
		que = q;
	}
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1500);
				System.out.println("Producing: "+i);
				que.add(new Message(" "+i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		que.add(new Message("exit"));
	}
}
