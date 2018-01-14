package com.suchi.test.thread.divisible;

public class DivisibleBy5 implements CheckDivisible {

	String result;
	int num;
	public DivisibleBy5(String s){
		result = s;
	}
	
	public void setNum(int n){
		num = n;
	}
	
	@Override
	public void checkDivisible(int n) {		
		if(result!=null){
			if(n%5 == 0)
				result = new String("Divisible y 5: Buzz");
		}
			
	}

	@Override
	public void run() {
		checkDivisible(num);		
	}
	
}
