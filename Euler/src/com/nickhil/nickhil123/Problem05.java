package com.nickhil.nickhil123;

/*
 * Problem5: 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 * ANSWER: 27720
 */


public class Problem05 {

	
	public static void main(String[] args) {
		/*int p=1;
		for(int i=1;i<10;i++)
		{
			if(prime(i))
			{   
				//int a=p%i;
				p=p*i;
			}
			else if(p%i!=0)
			{
				p=p*(p%i);
				
			}
		}
		System.out.println(p);
	}

	private static boolean prime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return true;
		return false;
	}*/
	int p=1;int a=1;	
	for(int i=1;i<=12;i++)
	{
		if(prime(i))
		{
			p=p*i;
		}
		else if(p%i!=0)
		{
		for(int j=1;j<i;j++)
		{
			if(i%j==0)
				a=j;
		}
		p=p*(i/a);
		}//else
	}
	System.out.println(p);
	}

	private static boolean prime(int n) {
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return true;
		return false;
	}

}
