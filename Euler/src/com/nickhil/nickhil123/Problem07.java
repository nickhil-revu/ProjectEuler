package com.nickhil.nickhil123;


/*
 * Problem: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * ANSWER:104743
 * 
 * ANSWER:104743
 */
		
		
import java.util.ArrayList;

public class Problem07 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		int i,j;
		int count=0;
		ArrayList<Integer> list = new<Integer> ArrayList();
		for(i=2;i<=200000;i++)
		{
			for(j=1;j*j<=i;j++)
			{
			  if(i%j==0)
				  count+=1;
			}
			
			if(count==1)
			{
				list.add(i);
				System.out.println(i);
			}
			count= 0;
			
			if(list.size()>10000)
				break;
		}
		
		
		System.out.println("6th Prime Number = "+list.get(5));
		System.out.println("1001th Prime Number = "+list.get(10000));
	}

}
