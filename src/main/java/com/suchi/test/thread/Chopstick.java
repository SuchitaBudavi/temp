package com.suchi.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
	
	Lock lock;
	int id;
	Chopstick(int id){
		this.id = id;
		lock = new ReentrantLock();
	}
	
	boolean pickUp(){		
		boolean val = lock.tryLock();		
		System.out.println(id+" Picked up");
		return val;
	}
	
	void putDown(){		
		lock.unlock();
		System.out.println(id+" Put Down");
	}
}
