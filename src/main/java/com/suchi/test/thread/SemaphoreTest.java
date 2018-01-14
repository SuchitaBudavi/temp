package com.suchi.test.thread;

import java.util.concurrent.Semaphore;

public class SemaphoreTest extends Thread{

	int id;
	Semaphore sem1,sem2;
	SemaphoreTest(int id){
		this.id = id; 
		sem1 = new Semaphore(1);
		sem2 = new Semaphore(1);
			
		try {			
			sem1.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void first(){
		System.out.println("First method is executing...");		
		sem1.release();		
	}
	
	void second(){
		try {			
			sem1.acquire();
			sem1.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Second method is executing...");
	}
	
	void third(){
		System.out.println("Third method is executing...");
	}
	
	public void run(){
		if(id == 1)
			first();
		else if(id == 2)
			second();
		//third();
			
	}
}
