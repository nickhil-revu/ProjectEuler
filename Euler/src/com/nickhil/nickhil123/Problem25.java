package com.nickhil.nickhil123;

import java.math.BigInteger;
/* PROBLEM 25: The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8

F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * 
 * 
 * ANSWER: 4782
 */
public class Problem25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger max = pow(BigInteger.valueOf(10L),BigInteger.valueOf(999L));
		BigInteger[] fib = new BigInteger[3];
		int i=0;int cnt=1;
		fib[0]=BigInteger.valueOf(1l);
		fib[1]=BigInteger.valueOf(1l);
		while(fib[i].compareTo(max)<=0)
		//while(cnt<=12)
		{
			
			fib[2]=fib[1].add(fib[0]);
			fib[0]=fib[1];
			fib[1]=fib[2];
			cnt++;
			
		}
		System.out.println(cnt);
		System.out.println(fib[i]);
		
	}

	public static BigInteger pow(BigInteger base, BigInteger exponent) {
		  BigInteger result = BigInteger.ONE;
		  while (exponent.signum() > 0) {
		    if (exponent.testBit(0)) result = result.multiply(base);
		    base = base.multiply(base);
		    exponent = exponent.shiftRight(1);
		  }
		  return result;
		}
}
