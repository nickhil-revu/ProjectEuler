package com.nickhil.nickhil123;

public class Problem28 {

	/* Problem 28: Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
	 * 
	 * 
	 * Answer: 669171001
	 */
	public static void main(String[] args) 
	{
		long num = 1001*1001;
		long sum=1;
		long k=2;
		long j=3;
		for(long i=1;i<num;)
		{
			if(i<j*j)
			{
				 i=i+k;
				 sum+=i;
				 System.out.println(i);
			}
			else
			{
				j=j+2;
				k=k+2;
				i=i+k;
				sum+=i;
				System.out.println(i);
			}
			  			
		}
		System.out.println("sum =" +sum );
	}

}
