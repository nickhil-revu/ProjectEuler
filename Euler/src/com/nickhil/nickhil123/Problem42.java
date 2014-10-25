package com.nickhil.nickhil123;

import java.math.BigInteger;
/* Problem 48: The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.
 * 
 * 
 * 
 * Answer: 9110846700
 */
public class Problem42 {
	
	public static void main(String[] args)
	{
		BigInteger sum = BigInteger.valueOf(0);
		for(int i=1;i<=1000;i++)
		{
			BigInteger index = BigInteger.valueOf(i);
			BigInteger power = index.pow(i);
			sum = sum.add(power);
			
			
		}
		System.out.println(sum);
		
		
		System.out.println("Number of digits:"+sum.toString().length());
		
	}

	
	

}
