package com.suchi.test.thread;

public class RunnableExample implements Runnable {

	private String name;
	private Employee e;
	
	RunnableExample(String name, Employee emp){
		this.name = name;
		this.e = emp;
	}	
	
	@Override
	public void run() {		
		/*if(name == "1")
			e.fooStatic(name);
		else
			e.booStatic(name);*/
		e.foo(name);
	}

}
