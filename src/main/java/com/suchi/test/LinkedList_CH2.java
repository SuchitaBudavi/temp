package com.suchi.test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_CH2 {
	
	//not a good way of returning values
	ListNode kthLastNode = null;
	
	//remove duplicate elements
	void removeDups(ListNode head){			
		
		System.out.println("List before removing dups->");
		ListNode n = head;
		while(n != null) {			
			System.out.print(n.data+",");
			n = n.next;
		}
		
		HashSet<Integer> elements = new HashSet<Integer>();
		n = head;
		ListNode prevNode = null;
		while(n !=null){
			if(elements.contains(Integer.valueOf(n.data))){			
				prevNode.next = n.next;				
			}else{
				elements.add(Integer.valueOf(n.data));
				prevNode = n;
			}
			
			n = n.next;
		}
		
		System.out.println("List after removing duplicates->");
		n = head;
		while(n != null) {			
			System.out.print(n.data+",");
			n = n.next;
		}
	}
	
	
	//Kth element from last
	//this one only print but doesnt return the node
	int printLastKthElement(ListNode node, int K){
		if(node == null){
			return 0;
		}
		int index = printLastKthElement(node.next,K)+1;
		if(index == K){
			System.out.println("Kth Element is: "+node.data);
			kthLastNode = node;
		}
		node = node.next;
		return index;
	}
	
	//Kth element using recursive way
	//point p1 and p2 move K elements apart
	//once p2 reaches end P1 will be pointing to kth element
	void printKthElementIterative(ListNode head, int k){
		int i = 0;
		ListNode p1, p2;
		p1 = p2 = head;
		for(i=0;i<k;i++){
			p2 = p2.next;
			if(p2==null)
				break;
		}
		if(i == k){
			while(p2 != null){
				p1 = p1.next;
				p2 = p2.next;					
			}
			System.out.println("Kth last element is: "+p1.data);
		}else{
			System.out.println("index out of list boundry");
		}
	}
	
	//delete intermediate node having access to only that node
	void deleteIntermediateNode(ListNode node){
		node.data = node.next.data;
		node.next = node.next.next;		
	}
	
	//partition smaller to higher aroung a value
	void partitionAroundElement(ListNode head, int val){
		ListNode p1, p2;
		p1 = p2 = head;
		
		
	}
	
	void sumLinkedList(ListNode head1, ListNode head2){
		ListNode n1, n2, resultHead = null;
		n1 = head1;
		n2 = head2;
		int carryForward = 0, sum = 0, n1Data = 0, n2Data = 0;
		
		while(n1 != null || n2 !=null){
			if(n1 == null){
				n1Data = 0;
			}
			else{
				n1Data = n1.data;
				n1 = n1.next;
			}
			if(n2 == null){
				n2Data = 0;
			}
			else{
				n2Data = n2.data;
				n2 = n2.next;
			}
			sum = carryForward + n1Data + n2Data;
			carryForward = sum/10;			
			if(resultHead == null){
				ListNode newNode = new ListNode(sum%10);
				resultHead = newNode;
			}else{
				resultHead.add(sum%10);
			}					
		}
		
		System.out.println("Result addition is ->");
		ListNode n = resultHead;
		while(n != null){
			System.out.print(n.data);
			n = n.next;
		}
	}
	
	void sumLinkedListRecursiveCall (ListNode n1, ListNode n2, int carryForward, ListNode n){
		n=sumLinkedListRecursive(n1,n2,carryForward,n);
		System.out.println("Result addition is ->");
		while(n != null){
			System.out.print(n.data);
			n = n.next;
		}
		
	}
	
	ListNode sumLinkedListRecursive(ListNode n1, ListNode n2, int carryForward, ListNode n){		
		int sum = 0, n1Data = 0, n2Data = 0;							
		if(n1 == null & n2 == null){
			return n;
		}
		if(n1 == null){
			n1Data = 0;
		}
		else{
			n1Data = n1.data;			
		}
		if(n2 == null){
			n2Data = 0;
		}
		else{
			n2Data = n2.data;		
		}		
		sum = n1Data + n2Data + carryForward;
		if(n == null){
			n = new ListNode(sum%10);
		}else{
			n.add(sum%10);
		}
		sumLinkedListRecursive(n1!=null?n1.next:null,n2!=null?n2.next:null,sum/10,n);		
		return n;
	}
	
	void sumLinkedListForwardOrder(ListNode head1, ListNode head2){
		int list1Size = 0, list2Size = 0,maxSize = 0;
		list1Size = sizeOfList(head1);
		list2Size = sizeOfList(head2);
		//pad smaller list with zeros at the front
		if(list1Size > list2Size){
			head2 = padListWithZeros(head2,list1Size-list2Size);
			maxSize = list1Size;
		}else{
			head1 = padListWithZeros(head1,list2Size-list1Size);
			maxSize = list2Size;
		}
		System.out.println("Both lists after padding");
		printList(head1);
		printList(head2);
		
		printList(additionList(head1,head2).n);
		
	}
	
	class AdditionListResult{
		ListNode n;
		int carryForward;
	}
	
	AdditionListResult additionList(ListNode n1, ListNode n2){
		if(n1.next == null && n2.next == null){
			int sum = n1.data + n2.data;
			ListNode n = new ListNode(sum%10);
			AdditionListResult result = new AdditionListResult();
			result.n = n;
			result.carryForward = sum/10;
			return result;
		}
		AdditionListResult resultTemp = additionList(n1.next,n2.next);
		int sumTemp = resultTemp.carryForward + n1.data + n2.data;
		ListNode newNode = new ListNode(sumTemp%10);
		newNode.next = resultTemp.n;
		resultTemp.n = newNode;
		resultTemp.carryForward = sumTemp/10;
		return resultTemp;
	}
	
	int sizeOfList(ListNode head){
		int size = 0;
		while(head != null){
			size++;
			head = head.next;
		}
		return size;
	}
	
	ListNode padListWithZeros(ListNode head,int padLength){
		ListNode newHead = head;
		for (int i = 0; i < padLength; i++) {			
			ListNode n = new ListNode(0);
			n.next = newHead;
			newHead = n;
		}
		return newHead;
	}
	
	void printList(ListNode head){
		System.out.println("Printing list->");
		while(head != null){
			System.out.print(head.data);
			head = head.next;
		}
		System.out.println("");
	}	
	
	void ifPalindrome(ListNode head){
		ListNode n1,n2;
		n1 = head.next;
		n2 = head.next.next;		
		while(n2.next != null){
			n1 = n1.next;
			n2 = n2.next.next;
		}
	}
	
	void ifIntersectingList(ListNode head1, ListNode head2){
		ListNode n1, n2;
		int list1size = 0, list2size = 0,diffLength = 0;
					
		list1size = sizeOfList(head1);
		list2size = sizeOfList(head2);
		
		//advance in longer list
		if(list1size>list2size){
			n1 = head1;
			n2 = head2;
			diffLength = list1size-list2size;
		}else{
			n1 = head2;
			n2 = head1;
			diffLength = list2size-list1size;
		}		
		for(int i=0;i<diffLength;i++){
			n1 = n1.next;
		}
		
		ListNode intersectingNode = null;
		while(n1 != null && n2 != null){
			//compare reference
			if(n1 == n2){
				intersectingNode = n1;
				break;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		if(intersectingNode == null){
			System.out.println("lists do not intersect");
		}else{
			System.out.println("lists intersect at node "+intersectingNode+" with value "+intersectingNode.data);
		}		
	}
	
	void findLoopInList(ListNode head){
		ListNode n1,n2;
		n1 = n2 = head;
		n1 = n1.next;
		n2 = n2.next.next;
		while(n1!=null && n2!=null){
			if(n1 == n2){
				break;
			}
			n1 = n1.next;
			n2 = n2.next.next;
		}
		
		if(n1!=null && n2!=null){
			n2 = head;
			while(n1 != n2){
				n1 = n1.next;
				n2 = n2.next;
			}
			System.out.println("List Loop at value: "+n1.data);
		}else{
			System.out.println("Lists do not loop");
		}
	}
}

