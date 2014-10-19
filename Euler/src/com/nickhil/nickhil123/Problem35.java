package com.nickhil.nickhil123;

/* Problem:35 The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

How many circular primes are there below one million?
 * 
 * 
 * Answer: 55
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem35 {
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static void main(String[] args)
	{
		for(int i=10;i<1000000 ;i++)
		{
			if(isPrime(i))
				primes.add(i);
		}
		
		circPrime();
		
		//test();
		
	}

	/*private static void test() {
		
		int a,limit=2;
		int p=123456;
		if(p>100&&p<1000)
			limit =3;
		if(p>1000)
			limit = 4;
		if(p>10000)
			limit=5;
		if(p>100000)
			limit = 6;
		
		for(int i=0;i<limit;i++)
		{
		a=p%10;
		p=p/10;
		p=(int) (a*Math.pow(10, limit-1)+p);
		System.out.println(p);
			
		}		
	}*/

	private static boolean isPrime(Integer n) {
		int count=0;
		String a1 = n.toString();
		if(a1.contains("2")||a1.contains("4")||a1.contains("6")||a1.contains("8")||a1.contains("0")){
			//System.out.println("prime with even:"+a1);
		}
		else
		{
			for(int i=1;i*i<=n;i++)
			{
			  	if(n%i==0)
			  		count++;
			}
			if(count==1)
			   return true;
		}
		return false;
	}

	private static void circPrime()
	{
		
		/*for(Integer p:primes)
			System.out.println(p);*/
		int count=1+4;// count starts with 1 and adds 4 for single digit prime numbers
		Set<Integer> cPrime = new HashSet<Integer>();
		for(Integer p1:primes)
		{
			int a,limit=2;
			boolean check = true;
			int p=p1;
			if(p>100&&p<1000)
				limit =3;
			if(p>1000)
				limit = 4;
			if(p>10000)
				limit=5;
			if(p>100000)
				limit = 6;
			
			for(int i=1;i<limit;i++)
			{
			a=p%10;
			p=p/10;
			p=(int) (a*Math.pow(10, limit-1)+p);
			if(!primes.contains((Integer)p))
				 check=false;
				
			}
			if(check==true)
			cPrime.add(p);
		}
		
		for(Integer p:cPrime)
			System.out.println(p+" "+count++);
		System.out.println("final count : "+(count-1));
	}
}
