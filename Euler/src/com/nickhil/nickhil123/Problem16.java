package com.nickhil.nickhil123;

import java.math.BigInteger;

/* Problem16: 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 * 
 * 
 * ANSWER: 1366
 */
public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger n;
		
		int sum=0;
		BigInteger i=BigInteger.valueOf(2);
		n=i.pow(1000);
		System.out.println(n);
		
		String str=""+n;System.out.println(str.length());
		char[] s= str.toCharArray();
		for(char ch:s)
		{
			sum+=Integer.parseInt(""+ch);
		}
			
		System.out.println("sum"+sum);
	}

}
