package com.nickhil.nickhil123;

/* 
 * Problem: A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
	Find the largest palindrome made from the product of two 3-digit numbers.
	
	ANSWER:993*913=906609
 */

public class Problem04 {

	public static void main(String[] args) {

		for(int i=1000;i>100;i--)
		{
			for(int j=1000;j>100;j--)
			{
				if(Palindrome(i*j))
				{   
					System.out.println(i+","+j+"="+i*j);
					break;
				}
					
			}
		}
		System.out.println("end");
	}

	private static boolean Palindrome(int n) {
		int rev=0;
		int num=n;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		if(num==rev)
			return true;
		return false;
	}

}
