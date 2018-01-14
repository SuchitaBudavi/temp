package com.suchi.test.stackqueue;

import com.suchi.test.stackqueue.Mystack.StackNode;

public class StackQueue_CH3 {

	//sort stack using another stack
	void sortStack(Mystack stack){
		int tempVal=999,counter;		
		Mystack<Integer> tempStack = new Mystack<Integer>();
		
		counter = stack.size;
		for(int i=0;i<stack.size;i++){
			StackNode n = stack.top;
			//find the min in the stack
			for(int j=0;i<counter;i++){			
				if((Integer)n.data < tempVal){
					tempVal = (Integer)n.data;
				}
				tempStack.push((Integer) stack.pop());	
				n = stack.top;
			}
			counter--;
			//push all elements other than min to original stack
			stack.removeAll();
			stack.push(tempVal);
			StackNode tempNode = tempStack.top;
			while(tempNode != null){
				if(tempVal != (Integer)tempNode.data){
					stack.push(tempStack.pop());					
				}else{
					tempStack.pop();
				}
				tempNode = tempNode.next;
			}
		}
		
		System.out.println("Sorted Stack");
		stack.printStack();
	}
		
}
