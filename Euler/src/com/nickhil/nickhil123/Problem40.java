package com.nickhil.nickhil123;
/* Problem 40:An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...
             ^

It can be seen that the 12th digit of the fractional part is 1.

If dn represents the nth digit of the fractional part, find the value of the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
 * 
 * 
 * 
 */

public class Problem40 {
	public static void main(String[] args)
	{
		StringBuffer str =new StringBuffer();
		for(int i=1;i<1000000;i++)
		{
			str.append(i);
			if(str.length()>1000000)
				break;
			
		}
		int j=0;
		int product=1;
		//System.out.println(str);
		while(j<=6)
		{
			char ch = str.charAt((int) Math.pow(10,j)-1);
			int n = Integer.parseInt(""+ch);
			System.out.println(n);
			product *= n;
			//product *= Integer.parseInt(""+str.charAt((int) Math.pow(10,j)-1));
			j++;
		}
		System.out.println("product:"+product);
	}

}
