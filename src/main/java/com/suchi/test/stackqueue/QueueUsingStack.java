package com.suchi.test.stackqueue;

import com.suchi.test.stackqueue.Mystack.StackNode;

public class QueueUsingStack {

	//add into newest
	Mystack<Integer> newestStack = new Mystack<Integer>();
	//remove from oldest
	Mystack<Integer> oldestStack = new Mystack<Integer>();
	
	//add
	void add(int val){
		newestStack.push(val);
	}
	
	private void pushToOldestStack(){
		StackNode n = newestStack.top;
		while(n != null){
			oldestStack.push((Integer) n.data);
			n = n.next;
		}
	}
	
	//remove
	StackNode remove(){
		StackNode n = oldestStack.top;	
		if(oldestStack.top == null){
			pushToOldestStack();
			newestStack.removeAll();
		}
		oldestStack.top = oldestStack.top.next;
		return n;
	}
	
	//peek
	
	//print
	void printQueue(){
		System.out.print("Queue is ->");		
		oldestStack.printStack();
		newestStack.printStack();
	}
	
}
