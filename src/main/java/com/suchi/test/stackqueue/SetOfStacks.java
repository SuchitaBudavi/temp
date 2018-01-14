package com.suchi.test.stackqueue;

import java.util.ArrayList;
import java.util.Iterator;

public class SetOfStacks {

	ArrayList<Mystack> setOfStacks = new ArrayList<Mystack>();
	final int MAX_STACK_SIZE = 5;	
	
	
	int findAvailableStack(){
		int i;
		for (i=0;i<setOfStacks.size();i++) {
			Mystack mystack = (Mystack) setOfStacks.get(i);
			if(mystack.size != MAX_STACK_SIZE)
				return i;
			
		}		
		return i;
	}
	
	
	//push into stack starting from first
	void push(Integer val){
		int stackNum = findAvailableStack();
		if(setOfStacks.size()==stackNum){
			setOfStacks.add(new Mystack<Integer>());
		}
		setOfStacks.get(stackNum).push(val);		
	}
		
	int findLastStack(){
		return setOfStacks.size()-1;	
	}
	//popAt from specific stack
	Integer popAt(int stackNum){
		stackNum--;
		Mystack stack = setOfStacks.get(stackNum);
		if(stack == null){
			System.out.println("stack num doesnt exist");
			return -999;
		}else if(stack.size == 1){
			Integer val = (Integer) stack.pop();
			setOfStacks.remove(stackNum);
			return val;
		}else{
			return (Integer) setOfStacks.get(stackNum).pop();
		}
	}
	
	
	//pop from the last
	Integer pop(){
		int lastStackNum = findLastStack();
		Mystack stack = setOfStacks.get(lastStackNum);
		if(stack.size == 0){
			System.out.println("Stack is empty");
			return null;
		}else if(stack.size == 1){
			Integer val = (Integer) stack.pop();
			setOfStacks.remove(lastStackNum);
			return val;
		}else{
			return (Integer) setOfStacks.get(lastStackNum).pop();
		}
	}
	
	
	void printSetOfStack(){
		for (Iterator iterator = setOfStacks.iterator(); iterator.hasNext();) {
			Mystack mystack = (Mystack) iterator.next();
			if(mystack.size>0)
				mystack.printStack();
		}
	}
}
