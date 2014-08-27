package com.nickhil.nickhil123;


/* Problem10: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 * 
 * ANSWER: 142913828922
 */

public class Problem10 {
	public static void main(String[] args) {
		int i,j;
		int count=0;
		long sum=0;
		long start = System.currentTimeMillis();
		for(i=2;i<=2000000;i++)
		{
			for(j=1;j*j<=i;j++)
			{
			  if(i%j==0)
				  count++;
			  if(count==2)
				  break;
			}
			
			if(count==1)
			{
				sum+=i;
			}
			count= 0;	
		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("Sum1 = "+sum);
		System.out.println(end-start);
	}

}
