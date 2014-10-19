package com.nickhil.nickhil123;

/* Problem 34: 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

Find the sum of all numbers which are equal to the sum of the factorial of their digits.

Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * 
 * 
 * 
 * Hint: 9! x 7 has 7 digits  and 9! x 8 has 7 digits so last number can be of 7 digits
 * 
 * 
 * Answer: 40730
 */
public class Problem34 {
	public static void main(String[] args)
	{
		long sum=0;
		//System.out.println(fact(5));
		for(long i=3;i<10000000;i++)
		{
			//System.out.println(i);
			long n=i;
			long val=0;
			while(n!=0)
			{
				long r = n%10;
				val+=fact(r);
				n=n/10;
			}
			if(val==i)
			{
				sum+=i;
				System.out.println(i);
			}
				
		}
		System.out.println("sum="+sum);
	}

	/*private static long fact(long r) {
		if(r==1)
			return 1;
		else 
			return  (r*fact(r-1));
	}*/
	
	private static long fact(long r)
	{
		
		long pro=1;
		while(r>1)
		{
			pro*=r;
			r=r-1;
		}
		return pro;
	}

}
