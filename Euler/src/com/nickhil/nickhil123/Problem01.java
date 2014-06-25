package com.nickhil.nickhil123;

import java.util.HashSet;
import java.util.Set;

/*Question :If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 * ANSWER:233168
 * */

public class Problem01 {

/*	public static void main(String[] args) {
		int[] a = new int [1000];
		int sum=0;
		Set<Integer> s= new HashSet<Integer>();
		for(int i=0;i<500;i++)
		{
			if(3*i<1000)
				s.add(3*i);
			if(5*i<1000)
				s.add(5*i);
		}
		System.out.println(s);
		for(int i:s)
			sum+=i;
		System.out.println("Sum="+sum);
	}

}*/  //Working code
	
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=0;i<1000;i++)
		{
			if(i%3==0)
				sum+=i;
			else if(i%5==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}