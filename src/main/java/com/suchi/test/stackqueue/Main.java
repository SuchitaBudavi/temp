package com.suchi.test.stackqueue;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*FixedMultiStack multiStack = new FixedMultiStack(4);
		multiStack.push(1, 1.1f);
		multiStack.push(1, 1.2f);
		multiStack.push(2, 2.1f);
		multiStack.push(3, 3.1f);
		multiStack.push(2, 2.2f);
		multiStack.push(3, 3.2f);
		multiStack.push(3, 3.3f);
		multiStack.push(3, 3.4f);
		multiStack.push(3, 3.5f);
		
		//print whole stack
		multiStack.printAllStack();
				
		multiStack.pop(3);
		multiStack.pop(1);
		System.out.println(multiStack.peek(2));
		System.out.println(multiStack.peek(1));
		//print whole stack
		System.out.println("After popping");
		multiStack.printAllStack();*/
		
		/*System.out.println("Push, Pop, Min in O(1)");
		Mystack<Integer> stack = new Mystack<Integer>();
		
		stack.push(4);
		stack.push(7);
		stack.push(3);
		stack.push(2);
		stack.push(9);
		stack.push(10);
		stack.pop();
		stack.pop();
		System.out.println("Min is: "+stack.min());*/
		
		/*System.out.println("<----------------- Set of multiple stack represented as one --------------------------->");
		SetOfStacks setOfStacks = new SetOfStacks();
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		setOfStacks.push(6);
		setOfStacks.push(7);
		setOfStacks.push(8);
		setOfStacks.push(9);
		setOfStacks.push(10);
		setOfStacks.push(11);
		setOfStacks.push(12);
		setOfStacks.push(13);
		setOfStacks.push(14);		
		
		setOfStacks.printSetOfStack();
		setOfStacks.pop();
		setOfStacks.pop();
		setOfStacks.pop();
		setOfStacks.pop();
		setOfStacks.pop();	
		setOfStacks.popAt(1);		
		setOfStacks.pop();
		setOfStacks.printSetOfStack();*/
		
		/*System.out.println("<------------------ Queue using two stacks -------------------------->");
		QueueUsingStack q = new QueueUsingStack();
		q.add(1);
		q.add(2);		
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.add(6);
		q.printQueue();*/
		
		/*System.out.println("<--------------- sort stack using one more stack ---------------->");
		Mystack<Integer> stack = new Mystack<Integer>();
		stack.push(4);
		stack.push(2);
		stack.push(8);
		stack.push(1);
		stack.push(10);
		StackQueue_CH3 ch3Helper = new StackQueue_CH3();
		ch3Helper.sortStack(stack);*/
		
		System.out.println("<------------------ Animal adoption system ------------------>");
		AnimalAdoption adoption = new AnimalAdoption();
		adoption.enqueue("dog");
		adoption.enqueue("cat");
		adoption.enqueue("cat");
		adoption.enqueue("dog");
		adoption.enqueue("dog");
		adoption.enqueue("cat");
		adoption.enqueue("dog");
		adoption.enqueue("cat");
		adoption.print();
		System.out.println("dequeing..........");
		System.out.println(adoption.dequeueDog());
		System.out.println(adoption.dequeueAny());
		System.out.println(adoption.dequeueAny());
		System.out.println(adoption.dequeueCat());
		adoption.print();
	}

}
