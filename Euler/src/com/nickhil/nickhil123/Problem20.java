package com.nickhil.nickhil123;

import java.math.BigInteger;

/* Problem 20: n! means n × (n − 1) × ... × 3 × 2 × 1

*For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
*and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

*Find the sum of the digits in the number 100!
 * 
 * 
 * ANSWER: 648
 */

public class Problem20 { 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger num = BigInteger.valueOf(1);
		//long num=1;
		long i; BigInteger sum = BigInteger.valueOf(0);
		for(i=1;i<=100;i++)
			num=num.multiply(BigInteger.valueOf(i));
		System.out.println(num);
		while(!num.equals(BigInteger.valueOf(0)))
		{
			BigInteger n= num.mod(BigInteger.valueOf(10L));
			num=num.divide(BigInteger.valueOf(10));
			sum=sum.add(n);
		}
		System.out.println("sum "+sum);
	}

}
