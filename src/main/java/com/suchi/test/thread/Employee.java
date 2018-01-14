package com.suchi.test.thread;

public class Employee {

	public void foo(String name){
		synchronized (this) {
			System.out.println("Thread "+name+" .foo() starting");
		}		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread "+name+" end of foo");
	}
	
	public static synchronized void fooStatic(String name){
		System.out.println("Thread "+name+" .fooStatic() starting");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of fooStatic");
	}
	
	public static synchronized void booStatic(String name){
		System.out.println("Thread "+name+" .booStatic() starting");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of booStatic");
	}
	
	
}
