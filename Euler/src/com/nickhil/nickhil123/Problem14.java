package com.nickhil.nickhil123;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* Problem 14: The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
 * 
 * 
 * ANSWER: 837799
 */
public class Problem14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		long i,n=0,num=0;
		long count=0,maxcount=1;
		for(i=1;i<1000000;i++)
		{
			n=i;
			//System.out.printf("for %d : ",n);
			while(n!=1)
			{
				
				if(n%2==0)
					n=n/2;
				else
					n=3*n + 1;
				count++;
				
				//System.out.print(" "+n);
			}
			if(count > maxcount)
			{
				maxcount=count;
				num=i;
			}
		//	System.out.println(count);
			count=0;
		}
		System.out.printf("max count = %d for %d ",maxcount,num);
		long end = System.currentTimeMillis();
		NumberFormat f = new DecimalFormat("#0.0000");
		System.out.println("Total Time :"+f.format((end-start)/1000d));
	}

}
