package com.suchi.test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArraysString_CH1 {

	//if one is permutation of another
	void arePermutations(String input1,String input2){
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		if(input1.length() != input2.length()){
			System.out.println("String are NOT permutations of each other");
		}else{
			//create charMap using input1
			for(int i=0;i<input1.length();i++){
				Character c = input1.charAt(i);
				if(charMap.containsKey(c)){
					charMap.put(c, charMap.get(c)+1);
				}else{
					 charMap.put(c, 1);
				}
			}
			
			//iterate over second map and reduce count as chars occur
			int i;
			for(i=0;i<input2.length();i++){
				if(charMap.containsKey(input2.charAt(i))){									
					if(charMap.get(input2.charAt(i)) == 0){
						System.out.println("String are NOT permutations of each other");
						break;
					}else{
						Character c = input2.charAt(i);
						charMap.put(c, charMap.get(c)-1);
					}
				}else{
					break;
				}
			}
			
			if(i == input2.length()){
				System.out.println("String are permutations of each other");
			}else{
				System.out.println("String are NOT permutations of each other");
			}
		}
	}
	
	//one away problem
	void checkIfOneAway(String input1, String input2){
		int lengthDiff = input1.length()-input2.length();
		boolean foundDiff = false;
		if(lengthDiff != 1 && lengthDiff != -1 && lengthDiff != 0){
			System.out.println("Both strings are NOT oneAway!");
		}else{
			// one replace
			if(lengthDiff == 0){
				int i;
				for(i=0;i<input1.length();i++){
					if(input1.charAt(i) != input2.charAt(i)){
						if(foundDiff){
							System.out.println("Both strings are NOT oneAway!");
							break;
						}else{
							foundDiff = true;
						}
					}
				}
				if(foundDiff == true && i == input1.length()){
					System.out.println("Both strings are oneAway!");
				}
			}else{
			// one addition, iterate over smaller string
				int counterLength = input1.length()<input2.length()?input1.length():input2.length();
				int i;
				for(i=0;i<counterLength;i++){
					if(input1.charAt(i) != input2.charAt(i)){
						System.out.println("Both strings are NOT oneAway!");
						break;
					}
				}	
				if(i == counterLength){
					System.out.println("Both strings are oneAway!");
				}
			}
		}
	}
	
	// print compressed string.
	// e.g aabcccccaaa = a2b1c5a3
	void compressString(String input){
		class CharWithCount{
			char c;
			int count;
		}
		
		LinkedList<CharWithCount> charMap = new LinkedList<CharWithCount>();
		char tempChar = input.charAt(0);
		int tempCount = 1;
		
		for(int i=1;i<input.length();i++){
			if(tempChar == input.charAt(i)){
				tempCount++;
			}else{				
				CharWithCount charWithCount = new CharWithCount();
				charWithCount.c = tempChar;
				charWithCount.count = tempCount;
				charMap.add(charWithCount);
				tempChar = input.charAt(i);
				tempCount = 1;				
			}
		}	
		
		CharWithCount charWithCount = new CharWithCount();
		charWithCount.c = tempChar;
		charWithCount.count = tempCount;
		charMap.add(charWithCount);
		
		System.out.println("Compressed string is: ");
		for (Iterator iterator = charMap.iterator(); iterator.hasNext();) {
			CharWithCount charWithCount1 = (CharWithCount) iterator.next();
			System.out.print(String.valueOf(charWithCount1.c)+charWithCount1.count);
		}
	}
	
	void reverseString(String input){
		System.out.println("reversed string: "+recursiveCall(input));
	}
	
	String recursiveCall(String input){
		if(input.length()<1){
			return input;
		}
		
		return recursiveCall(input.substring(1))+input.charAt(0);
	}
	
	//print number of vowels and consonants
	void printVowelsConsonants(String input){
		Pattern p = Pattern.compile("a|e|i|o|u",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		int vowelCount = 0;
		int charCount = 0;
		while (m.find()) {
			vowelCount++;
		}		
		
		p = Pattern.compile("[a-zA-Z]");
		m = p.matcher(input);
		while (m.find()) {
			charCount++;
		}
		System.out.println(input+" contains "+vowelCount+" vowels and "+(charCount-vowelCount)+" consonants");
	}
	
	//print start pyramid
	void printStarPyramid(int level){
		for(int i=0;i<level;i++){			
			System.out.println("");
			for(int j=0;j<level-i-1;j++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
		}
	}
	
	//print all possible substring from a given string
	public void printAllSubstrings(String input){
		HashSet<String> memory = new HashSet<String>();
					
		for(int i=0;i<input.length();i++){
			for(int j=0;j<input.length()-1;j=j+1){
				if((j+i) <input.length())
					memory.add(input.substring(j,j+i+1));
			}
		}
		
		System.out.println("");
		for (Iterator iterator = memory.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.print(string+", ");
		}
	}
}
