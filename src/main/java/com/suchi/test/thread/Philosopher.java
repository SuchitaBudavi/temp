package com.suchi.test.thread;

public class Philosopher extends Thread{

	int id;
	final int chewCount = 100;
	Chopstick left, right;
	
	Philosopher(int id,Chopstick left, Chopstick right){
		this.id = id; 
		this.left = left;
		this.right = right;
	}
	
	boolean pickUp(){		
		if(!left.pickUp())
			return false;
		if(!right.pickUp())
		{
			left.putDown();
			return false;
		}
		return true;
	}
	
	void putDown(){
		right.putDown();
		left.putDown();
	}
	
	void eat(){		
		System.out.println("Philosopher "+id+" in eating");
		if(pickUp()){
			chew();
			putDown();
		}
	}
	
	void chew(){
		
	}
	
	public void run(){		
		for(int i=0;i<chewCount;i++){
			System.out.println(id+" Philosopher in action...");
			eat();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
