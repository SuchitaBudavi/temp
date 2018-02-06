package com.suchi.test.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PrintDiffTriangles {

	/* 
	 * 
		     1
		    1 1
		   1 2 1
		  1 3 3 1
		 1 4 6 4 1
	 * 
	 */
	public void pascalTriangle(int n){
		ArrayList<Integer> memory = new ArrayList<Integer>();
		ArrayList<Integer> nextMemory = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			System.out.println("");
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
											
			for(int j=0;j<=i;j++){
				//print first 1
				if(j==0){
					System.out.print(" 1");
					if(i!=0)
						nextMemory.add(1);
				}
				
				//print additions from memory
				if(i>1 && !memory.isEmpty()){
					for(int k=0;k<memory.size()-1;k++){
						System.out.print(" "+(memory.get(k)+memory.get(k+1)));
						nextMemory.add((memory.get(k)+memory.get(k+1)));
						j++;
					}
					memory.clear();
				}
				
				//print last 1
				if(j==i && i!=0){
					System.out.print(" 1");
					nextMemory.add(1);
				}								
			}
			
			memory = (ArrayList<Integer>) nextMemory.clone();
			nextMemory.clear();
		}
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
}
