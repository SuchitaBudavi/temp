package com.suchi.test;
import java.util.HashMap;
import java.util.Scanner;

public class TechGigHelper {

	
	public void findMajorityNumber(){
		Scanner s = new Scanner(System.in);
		int arraySize=0;
		String input;
		String[] inputArray;
		HashMap<Integer,Integer> countMap = new HashMap<Integer,Integer>();
		int maxCount = 0;
		String maxNumber = null;
		
		arraySize = Integer.parseInt(s.nextLine());
		input = s.nextLine();
		inputArray = input.split(" ");
		
		for (int i = 0; i < inputArray.length; i++) {
			if(countMap.containsKey(Integer.parseInt(inputArray[i]))){
				Integer currentNum = Integer.parseInt(inputArray[i]);
				countMap.put(currentNum, countMap.get(currentNum)+1);
				if(countMap.get(currentNum) > maxCount){
					maxCount++;
					maxNumber = inputArray[i];
				}
			}else{
				countMap.put(Integer.parseInt(inputArray[i]), 1);
				if(maxCount==0){
					maxCount++;
					maxNumber = inputArray[i];
				}
			}
		}
		
		
		System.out.println("maximum number is: "+maxNumber);
	}
}
