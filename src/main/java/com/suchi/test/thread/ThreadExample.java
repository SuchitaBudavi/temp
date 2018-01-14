package com.suchi.test.thread;

public class ThreadExample extends Thread{
	
	public void run(){
		int count = 0;
		while(count < 100){
			System.out.println("Count: "+count++);
		}
	}
}
