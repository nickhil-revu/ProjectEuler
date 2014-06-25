package com.nickhil.nickhil123;

/* Problem:  The prime factors of 13195 are 5, 7, 13 and 29.
     
     What is the largest prime factor of the number 600851475143 ? 
 * 
 * 
 * ANSWER:6857
 * */

public class Problem03 {

	public static void main(String[] args) {
		//int n= 10;
		long n=600851475143L/104441;
		int count=0;
		for(long i=n;i>0;i--)
		{
			System.out.println(i);
			if(n%i==0)
				for(long j=1;j<i;j++)
				{
					if(i%j==0)
						count++;
					if(count==2)
						break;
				}
				if(count==1)
				{
					System.out.println(i);
					break;
				}
				count=0;
				
		}
		System.out.println("end");
	}

	

}
