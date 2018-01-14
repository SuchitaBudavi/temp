package com.suchi.test.random;

public abstract class AbstractTest {

	int val;
	
	private void print(){System.out.println("parent abstract");};
}

class AbstractChild extends AbstractTest{
	void print(){		
		System.out.println("child of abstract");
	}
}
