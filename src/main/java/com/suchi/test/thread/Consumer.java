package com.suchi.test.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{

	BlockingQueue<Message> que;
	Consumer(BlockingQueue<Message> q){
		que = q;
	}
	
	public void run(){
		try {
			while(!que.take().getMsg().equals("exit")){
				Thread.sleep(1500);
				System.out.println("Consuming: "+que.take().getMsg());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
