package com.nickhil.nickhil123;

import java.util.HashSet;
import java.util.Set;
/* Problem 32: We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.
 * 
 * 
 * Answer:45228
 */
public class Problem32 {
	
	public static void main(String[] nickhil)
	{
		long product;
		long sum=0;
		Set<Long> pandit = new HashSet<Long>();
		
		
		
		for(int i=0;i<100000;i++)
		{
			for(int j=0;j<100000;j++)
			{
				product = i*j;
				String str = ""+i+""+j+""+product;
				if(str.length()>10)
					break;
				if(str.length()==9)
					if(unique(str))
					{
						System.out.println(str);
						pandit.add(product);
					}
			} 
			
		}
		for(long l:pandit)
			sum+=l;
		System.out.println("Final Answer:"+sum);
		
		
	}

	private static boolean unique(String str) {
		
		if(str.contains("1")&&str.contains("2")&&str.contains("3")&&str.contains("4")&&str.contains("5")&&str.contains("6")&&str.contains("7")&&str.contains("8")&&str.contains("9"))
			return true;
		else
			return false;
	}

}
