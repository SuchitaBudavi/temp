package com.suchi.test;

public class BitManipulation_CH5 {

	String decimalToRadix(int num,int radix){					
		System.out.println(Integer.toUnsignedString(num, radix).toUpperCase() + " lenght: " + Integer.toUnsignedString(num, radix).length());
		StringBuffer output = new StringBuffer();
		
		while(num > 0){			
			output.append(charHexVal(num%radix));
			num = num/radix;
		}
		System.out.println("Decimal to Binary: ");
		System.out.println(output.reverse()+" lenght: "+output.length());
		return output.toString();
	}
	
	String charHexVal(int n){
		switch(n){
		case 10:
			return "A";
		case 11:
			return "B";
		case 12:
			return "C";
		case 13:
			return "D";
		case 14:
			return "E";
		case 15:
			return "F";
		default:
			return String.valueOf(n);
		}
	}
	
	int hexCharVal(char c){
		
		switch(c){
		case 'A':
			return 10;
		case 'B':
			return 11;
		case 'C':
			return 12;
		case 'D':
			return 13;
		case 'E':
			return 14;
		case 'F':
			return 15;
		default:
			return Character.getNumericValue(c);
		}
	}
	
	void radixToDecimal(String binaryStr, int radix){
		System.out.println(Integer.parseInt(binaryStr, radix));
		int result=0,pow=0;
		
		for(int i=binaryStr.length()-1;i>=0;i--){
			result +=hexCharVal(binaryStr.charAt(i)) * Math.pow(radix, pow++);
		}
		System.out.println("Binary to Decimal: "+result);
	}
	
	void fractionToBinary(double num){
		StringBuffer result = new StringBuffer();
		double tempFraction = 0.0, tempResult = 0.0;
		result.append(decimalToRadix((int)num, 2)+".");				
		tempResult = num;
		while(tempResult-(long)tempResult > 0 && result.length()<32){
			tempFraction = tempResult-(long)tempResult;
			tempResult = tempFraction * 2;
			result.append((long)tempResult);
		}
		
		System.out.println(result);
	}
	
	void flipToWin(int num){
		
	}
}
