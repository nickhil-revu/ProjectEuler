package com.nickhil.nickhil123;

import java.math.BigInteger;

/* Problem16: 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 * 
 * 
 * ANSWER: 88
 */
public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger n =BigInteger.valueOf((long) Math.pow( 2,1000 ));
		System.out.println(n);
		int sum=0;
		/*while(!n.equals(BigInteger.valueOf(0)))
		{
			long t=  (n.mod(BigInteger.valueOf(10)).longValue());
			sum+=t;
			n=n.divide(BigInteger.valueOf(10));
		}*/
		long no = n.longValue();
		while(no!=0)
		{
			long t = no%10;
			sum+=t;
			no=no/10;
		}
			
		System.out.println(sum);
	}

}
