package com.suchi.test.stackqueue;

public class FixedMultiStack {

	private float[] values;
	private int numOfStack = 3;
	private int[] stackSize = new int[numOfStack];
	private int stackCapacity;
	
	
	FixedMultiStack(int eachStackSize){
		stackCapacity = eachStackSize;
		values = new float[eachStackSize*numOfStack];
	}
	
	void push(int stackNum,float num) {
		stackNum = stackNum-1;
		if(stackSize[stackNum] == stackCapacity){
			System.out.println("Stack "+(stackNum+1)+" is full");
		}else{
			int index = (stackNum-1)<0? stackSize[stackNum] : (stackNum*stackCapacity)+(stackSize[stackNum]);
			values[index] = num;
			stackSize[stackNum]++;
		}
	}
	
	float pop(int stackNum){
		stackNum--;
		int index = (stackNum-1)<0? stackSize[stackNum]-1 : (stackNum*stackCapacity)+(stackSize[stackNum])-1;
		stackSize[stackNum]--;
		float val = values[index];
		values[index] = 0.0f;
		return val;
	}
	
	float peek(int stackNum){
		stackNum--;
		int index = (stackNum-1)<0? stackSize[stackNum]-1 : (stackNum*stackCapacity)+(stackSize[stackNum])-1;			
		return values[index];
	}
	
	void printAllStack(){		
		System.out.print("{");
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+",");
			if((i+1)%stackCapacity == 0){
				System.out.print("}");
				System.out.print("{");				
			}						
		}
	}
}
