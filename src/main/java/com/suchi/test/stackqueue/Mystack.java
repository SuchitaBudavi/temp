package com.suchi.test.stackqueue;

import java.util.ArrayList;
import java.util.LinkedList;

public class Mystack<T>{
	class StackNode<T> {		
		T data;
		StackNode<T> next = null;
		T min = null;
	}

	StackNode<T> top = null;
	int size=0;
	
	//push
	void push(T data){
		StackNode<T> newNode = new StackNode();
		newNode.data = data;
		newNode.next = top;
		if(top == null){
			newNode.min = data;
		}else{
			if((Integer)data < (Integer)top.min){
				newNode.min = data;
			}else{
				newNode.min = top.min;
			}
		}
		top = newNode;
		size++;
	}
		
	//pop
	T pop(){
		if(top == null){
			return null;
		}
		T data;
		data = top.data;
		top = top.next;
		size--;
		return data;
	}
	
	//peek
	T peek(){
		if(top == null)
			return null;
		return top.data;
	}
	
	//isEmpty
	boolean isEmpty(){
		return top == null;
	}
	
	//return minimum
	T min(){
		return top.min;
	}
	
	void removeAll(){
		top = null;
	}
	void printStack(){
		StackNode n = top;
		System.out.print("\n{");
		while(n != null){
			System.out.print(n.data+" ");
			n = n.next;
		}
		System.out.print("}");		
	}
}