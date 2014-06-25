package com.nickhil.nickhil123;


/*Problem 09: A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

		a2 + b2 = c2
		For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc
 * 
 * 
 * 375 200 425
Product : 31875000
 */
public class Problem09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n,sqrtn;
		for(int i=1;i<1000;i++)
		{
			for(int j=1;j<1000;j++)
			{
				n=(i*i)+(j*j);
				sqrtn = (int) Math.sqrt(n);
				if(n==(sqrtn*sqrtn))
					if(i+j+sqrtn==1000)
					{
						System.out.println(i+" "+j+" "+sqrtn);
						System.out.println("Product : "+i*j*sqrtn);
					}
			}
			
		}
	}

}
