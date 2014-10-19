package com.nickhil.nickhil123;

import java.util.ArrayList;
import java.util.List;

/* Answer: The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

(Please note that the palindromic number, in either base, may not include leading zeros.)
 * 
 * 
 * Answer: 872187
 */

public class Problem36 {
	
	public static void main(String[] args)
	{
		List<Integer> pal = new ArrayList<Integer>();
		List<Integer> bPal = new ArrayList<Integer>();
		int sum=0;
		for(int i=0;i<1000000;i++)
		{
			if(isPalindrome(i))
				pal.add(i);
		}
		//System.out.println(pal.size());
		for(Integer i:pal)
		{
			if(isBpalindrome(i))
				bPal.add(i);
		}
		
		for(Integer i:bPal)
		{
			sum+=i;
			System.out.println(i);
		}
		System.out.println("sum:"+sum);
		
		
		
		
	}

	private static boolean isBpalindrome(int n) {
		
		String binary = toBinary(n);
		//System.out.println("binary:"+binary);
		StringBuffer revBinary=new StringBuffer(binary);
		//System.out.println("reverse binary:"+revBinary);

		if(revBinary.reverse().toString().equals(binary.toString()))
			return true;
		return false;
}

	private static String toBinary(int n) {
		String s="";
		int r=0;
		while(n!=0)
		{
			r=n%2;
			n=n/2;
			s=s+r;
		}
		return s;
	}

	private static boolean isPalindrome(int n) {
		int n1=n,n2=0;
		int r;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			n2=n2*10+r;
		}
		if(n1==n2)
			return true;
		return false;
	}

}
