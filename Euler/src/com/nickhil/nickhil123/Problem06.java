package com.nickhil.nickhil123;

/*Problem6: The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * 
 * ANSWER : 25164150
 */


public class Problem06 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		int i;
		int sum1=0,sum2=0;
		for(i=1;i<=100;i++)
		{
			sum1+=(i*i);
		}
		
		int n = 100*101/2;
		sum2=(int) Math.pow(n, 2);
		System.out.println(sum2-sum1);
	}

}
