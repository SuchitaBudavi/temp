package com.suchi.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class BigOHelper {

	//O(n)
	boolean isPrimeNumber(int n){
		
		boolean isPrime = true;
		long start = System.currentTimeMillis();
		int i;
		for(i=2;i<n;i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}
		System.out.println("Number is prime? "+isPrime+" is divisble by: "+i);
		System.out.println("isPrimeNumber: "+(System.currentTimeMillis()-start)+" ms");
		return isPrime;
	}
	
	//O(square root of n)
	//any number if divisible by less than square root of itself then it is divisible by greater than square root as well
	boolean isPrimeTillSquareRoot(int n){
		boolean isPrime = true;
		long start = System.currentTimeMillis();
		int i;
		for(i = 2;i<n/2;i++){
			if(n%i == 0){
				isPrime = false;
				break;
			}
		}		
		System.out.println("Number is prime? "+isPrime+" is divisble by: "+i);
		System.out.println("isPrimeTillSquareRoot: "+(System.currentTimeMillis()-start)+" ms");
		return isPrime;
	}
	
	//O(n)
	long findFactorial(int n){
		long fact = 1;
		long start = System.currentTimeMillis();
		for(int i=n;i>0;i--){
			fact *= i;
		}
		System.out.println(n+"!= "+fact);
		System.out.println("findFactorial: "+(System.currentTimeMillis()-start)+" ms");
		return fact;
	}
	
	//O(n)
	long findFactorialRecurssive(int n){
		if(n <= 1){
			return 1;
		}else{
			return n * findFactorialRecurssive(n-1);
		}
	}
	
	//O(n-3) -> O(n)
	int findNthFibonacci(int n){
		int pre1 = 1;
		int pre2 = 1;
		int fib = 0;
		if(n <= 2)
			return 1;
		else{
			for(int i=3;i<=n;i++){
				fib = pre1 + pre2;
				pre2 = pre1;
				pre1 = fib;				
			}
			return fib;
		}
	}
	
	//e.g {1,7,5,9,2,12,3}, K=2
	//refine more to remove duplicate from result
	String findPairsWithDiffK(Integer[] list, int k){		
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(list));
		StringBuilder result = new StringBuilder();
		for (Integer number : list) {
			int prevNum = number-2;
			if(hashSet.contains(prevNum)){
				result.append("{"+number+","+prevNum+"}");
			}
			
			int nextNum = number + 2;
			if(hashSet.contains(nextNum)){
				result.append("{"+nextNum+","+number+"}");
			}
		}
				
		return result.toString();
	}
	
	//TODO - YET TO FINISH
	//e.g subString = abbc
	//target string = cbabadcbbabbcbabaabccbabc
	ArrayList<String> findPermutationSubString(String subString, String targetString){
		ArrayList<String> result = new ArrayList<String>();
		
		int pos;
		for (int i = 0; i < targetString.length(); ) {
			
			pos = checkSubString(subString,targetString,i);			
			if(pos != -1){
				i = pos;
			}else{				
				result.add(targetString.substring(i,i+subString.length()));
				i = i + subString.length();
			}
			
		}
		return result;
	}
	
	//TODO - YET TO FINISH
	//return -1 if subString is targetSring has perfect subString else return position of targetString where it differs
	int checkSubString(String subString, String targetString, int startPos){
		int pos = -1;
		char[] subStringArray = subString.toCharArray();
		char[] targetStringArray = targetString.substring(startPos, startPos+subString.length()).toCharArray();				
		
		Arrays.sort(subStringArray);
		System.out.println("sorted sub string: "+String.valueOf(subStringArray));
		Arrays.sort(targetStringArray);	
		System.out.println("sorted target string: "+String.valueOf(targetStringArray));		
		if(String.valueOf(subStringArray).equals(String.valueOf(targetStringArray)))
			return 0;
		else{
			return -1;
		}		
	}
	
	void getPermutations(String input){
		ArrayList<String> result = new ArrayList<String>();
		
		for (int i = 0; i < input.length(); i++) {
			result = insertIntoString(input.charAt(i), result);
		}
		
		//print result
		StringBuilder finalResult = new StringBuilder();
		for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			finalResult.append("{"+string+"},");
		}
		System.out.println("Permutation-> "+finalResult.toString());
		System.out.println("Permutation total count -> "+result.size());
	}
	
	ArrayList<String> insertIntoString(char c, ArrayList<String> result){
		ArrayList<String> copyOfResult = new ArrayList<String>(result);
		if(result.isEmpty()){
			result.add(String.valueOf(c));
			return result;
		}
		result = new ArrayList<String>();
		//iterate over all strings from result
		for (Iterator iterator = copyOfResult.iterator(); iterator.hasNext();) {
			//iterate over every position in and aroung of a string		
			String string = (String) iterator.next();			
			result.add(c+string);
			for(int i=1;i<string.length();i++){
				String pre = string.substring(0, i);
				String post = string.substring(i,string.length());
				result.add(pre+c+post);
			}
			result.add(string+c);
		}
		return result;
	}
	
	//find common from a sorted list of equal length
	//e.g - [13,27,35,40,49,55,59], [17,35,39,40,55,58,60]
	void findCommonElements(int[] input1, int[] input2){
		int[] result = new int[input1.length];		
		int j = 0, resultCounter = 0;
		for(int i=0;i<input1.length;){
			while(j<input2.length && i<input1.length){
				if(input1[i]<input2[j]){
					i++;
				}else if(input1[i]>input2[j]){
					j++;
				}else if(input1[i]==input2[j]){
					result[resultCounter++] = input1[i];
					i++;
					j++;
				}
			}
		}
		
		System.out.print("Common elements are: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+",");
		}
	}
}
