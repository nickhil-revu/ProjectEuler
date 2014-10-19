package com.nickhil.nickhil123;


/* Problem 33: The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
 * 
 * 
 * Procedure: 16x64; 19x95; 26x65; 49x98
 * 
 * Answer: 100 
 */
public class Problem33 {
	
	public static void main(String[] nickhil)
	{
		int i1,j1;
		for (int i=10;i<100;i++)
		{
			if(i/10==i%10)
				continue;
			for(int j=i+1;j<100;j++)
			{
				i1= i%10;
				j1=j/10;
				if(i1==j1)
				{	
				double p = (double)i/j;
				double q = (double)(i/10)/(j-(j/10)*10);
				if(p==q)
					System.out.println("i="+i+" j="+j);
				}
			}
		}
		
		
		
		/*for (int i=10;i<100;i++)
		{
			for(int j=i+1;j<100;j++)
			{
				
				
				double p = (double)i/j;
				double q = (double)(i/10)/(j-(j/10)*10);
				if(p==q)
					System.out.println("i="+i+" j="+j);
			}
		}*/
		
	}

}
