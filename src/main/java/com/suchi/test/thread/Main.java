package com.suchi.test.thread;

import java.util.ArrayList;
import java.util.Timer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.swing.plaf.SliderUI;

import com.suchi.test.thread.divisible.CheckDivisible;
import com.suchi.test.thread.divisible.DivisibleBy3;
import com.suchi.test.thread.divisible.DivisibleBy5;

public class Main {

	public static void main(String[] args) {	
		/*Employee emp = new Employee();
		Thread t1 = new Thread(new RunnableExample("1",emp));
		Thread t2 = new Thread(new RunnableExample("2",emp));
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}					
		System.out.println("Main thread ended\n");*/
		
		/*System.out.println("<!------ Philosophers table ------------->");
		Chopstick c1 = new Chopstick(1);
		Chopstick c2 = new Chopstick(2);
		Chopstick c3 = new Chopstick(3);
		Chopstick c4 = new Chopstick(4);
		
		Philosopher p1 = new Philosopher(1,c1,c2);
		Philosopher p2 = new Philosopher(2,c2,c3);
		Philosopher p3 = new Philosopher(3,c3,c4);
		Philosopher p4 = new Philosopher(4,c4,c1);
		p1.start();
		p2.start();
		p3.start();
		p4.start();*/
		
		/*SemaphoreTest sem1 = new SemaphoreTest(1);
		SemaphoreTest sem2 = new SemaphoreTest(2);		
		sem1.start();
		sem2.start();*/
		
		/*System.out.println("<!----------- FizzBuzz ------------->");
		int n = 25;
		String result = new String();
		CheckDivisible dby3 = new DivisibleBy3(result);
		CheckDivisible dby5 = new DivisibleBy5(result);
		
		Thread t1 = new Thread(dby3);
		Thread t2 = new Thread(dby5);
		for(int i=1;i<=n;i++){
			dby3.setNum(i);
			dby5.setNum(i);
			t1.start();
			t2.start();
		}	*/	
		
		/*TimerTest t = new TimerTest();
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(t,0,10*1000);
		System.out.println("Timer task started");
	     try {
	            Thread.sleep(120000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        timer.cancel();
	        System.out.println("TimerTask cancelled");*/
		
		/*AtomicTest t = new AtomicTest();
		Thread t1 = new Thread(t,"t1");
		Thread t2 = new Thread(t,"t2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(t.count+" "+t.atomicCount);*/
		/*AtomicTest a1 = new AtomicTest();		
		Thread t1 = new Thread(a1);		
		
		System.out.println("t1 started");
		t1.start();		
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread ended");*/
		
		/*Chopstick c = new Chopstick(1);
		Waiter waiter = new Waiter(c);
		Notifier notifier = new Notifier(c);
		Thread waitingThread = new Thread(waiter);
		Thread notifyingThread = new Thread(notifier);
		
		waitingThread.start();
		notifyingThread.start();*/
		
		/*BlockingQueue<Message> q = new ArrayBlockingQueue<>(60);
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();	*/
				
		/*ExecutorService c = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			ThreadPoolTest t = new ThreadPoolTest();
			c.execute(t);
		}
		
		c.shutdown();
		while(!c.isTerminated()){
			
		}
		System.out.println("Main method ended");		*/
		
		/*System.out.println("Addition using Callable and Future");
		ExecutorService e = Executors.newFixedThreadPool(10); 		
		ArrayList<Future<Integer>> intermediateResult = new ArrayList<Future<Integer>>();
		Integer finalResult = 0;
		
		for (int i = 1; i <= 30; i=i+2) {			
			Future<Integer> res = e.submit(new Addition(i,i+1));
			intermediateResult.add(res);
		}
				
		for (Future<Integer> future : intermediateResult) {
			try {
				finalResult += future.get();
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		System.out.println("Final result is: "+finalResult);	*/	
	}

}
