package com.suchi.test;

//Operation on linked list
//add, delete, traverse
public class ListNode {

	int data;	
	ListNode next = null;
	
	ListNode(int data){
		this.data = data;
	}
	
	public void add(int data){
		ListNode newNode = new ListNode(data);
		ListNode n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = newNode;		
	}
	
	void insertAtEnd(ListNode newNode){
		ListNode n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = newNode;
	}
	
	ListNode delete(ListNode headNode,int data){
		ListNode n = headNode;
		
		if(headNode.data == data){
			headNode.next = null;
			return headNode.next;
		}else{		
			while(n.next != null){
				if(n.data == data){
					n.next = n.next.next;
					break;
				}
				n = n.next;
			}
			return headNode;
		}
	}
}
