package com.nickhil.nickhil123;

import java.util.ArrayList;

/* 
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
							1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
find the sum of the even-valued terms.
 * 
 * 
 * 
 * ANSWER:4613732
 * */

public class Problem02 {

	
	public static void main(String[] args) {
		ArrayList<Integer> fibb = new ArrayList<Integer>();
		int f0=1;
		int f1=2;
		int sum=0;
		fibb.add(f0);
		fibb.add(f1);
		int temp;
		while(f0+f1<4000000)
		{
			fibb.add(f0+f1);
			temp = f1;
			f1=f1+f0;
			f0=temp;
			
			
		}
		System.out.println(fibb);
	
	for(int i:fibb)
		if(i%2==0)
			sum+=i;
	System.out.println("Sum = "+sum);
	}
	
}
