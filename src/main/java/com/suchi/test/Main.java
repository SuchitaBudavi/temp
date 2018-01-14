package com.suchi.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import com.suchi.test.LinkedList_CH2.AdditionListResult;

public class Main {

	public static void main(String[] args) {
		BigOHelper helper = new BigOHelper();
		TechGigHelper techGigHelper = new TechGigHelper();
		ArraysString_CH1 ch1Helper = new ArraysString_CH1();
		LinkedList_CH2 ch2Helper = new LinkedList_CH2();
		BitManipulation_CH5 ch5Helper = new BitManipulation_CH5();
		LinkedList_CH2.AdditionListResult t = ch2Helper.new AdditionListResult();
		//prime number
		/*System.out.println("<------------- PRIME --------------->");		
		helper.isPrimeNumber(2017);
		helper.isPrimeTillSquareRoot(2017);
		
		//factorial
		System.out.println("<------------- FACTORIAL --------------->");
		helper.findFactorial(23);
		long start = System.currentTimeMillis();
		System.out.println("23!= "+helper.findFactorialRecurssive(23));
		System.out.println("Factorial using recurssion: "+(System.currentTimeMillis()-start)+"ms");
		
		//fibonacci
		System.out.println("<------------- FIBONACCI --------------->");
		System.out.println("3rd Fibinacci no: "+helper.findNthFibonacci(10));*/
		
		//System.out.println("<------------- findMajorityNumber	------------->");	
		/*techGigHelper.findMajorityNumber();*/
		
		//System.out.println("<------------- find pairs from given list of numbers with difference of k	------------->");	
		/*int[] array = new int[4];		
		String result = helper.findPairsWithDiffK(new Integer[]{1,7,5,9,2,12,3},2);
		System.out.println(result);*/
		
		//System.out.println("<------------- find string which are subString of small string	------------->");
		//helper.findPermutationSubString("abbc", "adcbbabbcbabaabccbabc");
		
		//System.out.println("<------------- print permutation of given string	------------->");
		/*//Unit test ->
		  ArrayList<String> input = new ArrayList<String>();
		  input.add("abcd");
		  helper.insertIntoString('e', input);*/
		//helper.getPermutations("abcdef");
		
		/*System.out.println("<------------- find common elements from two arrays	------------->");
		helper.findCommonElements(new int[]{13,27,35,40,49,55,59}, new int[]{17,35,39,40,55,58,60});*/
		
		/*System.out.println("<------------- find common elements from two arrays	------------->");
		ch1Helper.arePermutations("abbc", "cbab");*/
		
		/*System.out.println("<------------- check if string are oneAway	------------->");
		ch1Helper.checkIfOneAway("pale", "paleee");*/
		
		/*System.out.println("<------------- compress given string	------------->");
		ch1Helper.compressString("aabcccccaaazzzz");*/
		
		/*System.out.println("<------------- reverse a string recursively	------------->");
		ch1Helper.reverseString("suchita");*/
		
		/*String s = "123abc";
		String[] splitString = new String[10];
		splitString = s.split("\\d+");
		if(splitString.length > 1){
			System.out.println("string contains non digit values");
		}else{
			System.out.println("Only digit string");
		}*/
		
		//ch1Helper.printVowelsConsonants("sU!!chit#a123");
		/*String input = "this is main	function";
		System.out.println(input.replaceAll("\\s", "%20"));*/
		
		//ch1Helper.printStarPyramid(10);
		
		System.out.println("<----------------------- CH2 Linked List ----------------->");
		ListNode head = new ListNode(2);
		head.add(3);
		head.add(8);
		head.add(4);
		head.add(5);
		head.add(2);
		head.add(2);
		head.add(5);
		head.add(6);
		
		//System.out.println("Remove duplicates from linked list");		
		//ch2Helper.removeDups(head);

		/*System.out.println("Get KthElement from the last");
		ch2Helper.printLastKthElement(head, 5);
		System.out.println("node: "+ch2Helper.kthLastNode.data);		
		ch2Helper.printKthElementIterative(head,10);
		
		System.out.println("<----------------------- List after removing ----------------->");
		ch2Helper.deleteIntermediateNode(ch2Helper.kthLastNode);
		System.out.println("List after deleting intemediate element");
		ListNode n = head;
		while(n != null){
			System.out.print(n.data);
			n = n.next;
		}*/
		
		//System.out.println("\n<----------------------- Adding Linked List ----------------->");
		ListNode head1 = new ListNode(7);		
		head1.add(1);
		head1.add(6);
		head1.add(1);
		/*ListNode n = new ListNode(8);
		head1.insertAtEnd(n);*/
		head1.add(5);
		
		ListNode head2 = new ListNode(5);		
		head2.add(9);
		//head2.insertAtEnd(n);
		
		
		//head2.add(1);
				
		//ch2Helper.sumLinkedList(head1,head2);
		//ch2Helper.sumLinkedListRecursiveCall(head1, head2, 0, null);
		//ch2Helper.sumLinkedListForwardOrder(head1,head2);			
		
		//ch2Helper.ifIntersectingList(head1,head2);

		/*ListNode head3 = new ListNode(1);		
		head3.add(2);
		head3.add(3);
		head3.add(4);
		head3.add(5);
		ListNode n = new ListNode(10);
		head3.insertAtEnd(n);
		head3.add(6);
		head3.add(7);
		head3.add(8);
		head3.add(9);
		head3.insertAtEnd(n);
		ch2Helper.findLoopInList(head3);*/
		
		//ch5Helper.decimalToRadix(1775,2);
		/*ch5Helper.radixToDecimal("10000000000",2);
		
		ch5Helper.decimalToRadix(222,16);
		ch5Helper.radixToDecimal("DE",16);*/
		
		//ch5 Q1
		/*int num = 19;
		num = num << 2;
		System.out.println(1024|num);*/
		
		//ch5Helper.fractionToBinary(0.72);
		
		//circular array
		int counter = 0;
		int[] circularArray = new int[5];
		for (int i = 0; i < circularArray.length; i++) {
			circularArray[counter] = i+1;
			counter++;		
		}
		if(counter == circularArray.length){
			counter = 0;
			circularArray[counter] = 6;
		}
		
	}
	

}
