package com.suchi.test.thread.divisible;

public class DivisibleBy3 implements CheckDivisible {

	String result;
	int num;
	public DivisibleBy3(String s){
		result = s;
	}
	
	public void setNum(int n){
		num = n;
	}
	
	@Override
	public void checkDivisible(int n) {		
		if(result!=null && result.equals("")){
			if(n%3 == 0)
				result = new String("Divisible y 3: Fizz");
		}
			
	}

	@Override
	public void run() {
		checkDivisible(num);		
	}

}
