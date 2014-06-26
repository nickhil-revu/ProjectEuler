package com.nickhil.nickhil123;

/* Problem15: Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
					 
					*__ __
					|__|__|
					|__|__|
						   *	
How many such routes are there through a 20×20 grid?
 * 
 *
 * ANSWER:137846528820 
 */

public class Problem15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i,j;long sum=0;
		//ArrayList<Integer> list = new ArrayList<Integer>();
		long[] a=new long[21];
			for(i=0;i<=20;i++)
			{
				//list.set(i,0);
				a[i]=0L;
			}
			a[1]=1L;
			long ans=2;
			for(i=2;i<=20;i++)
			{
				for(j=2;j<i;j++)
				{
					long temp = a[j];
					a[j]=a[j-1]+temp;
				}
				a[j]=ans;
				ans=0;
				sum=0;
				for(j=1;j<=i;j++)
				{
					sum+=a[j];
				}
				ans = 2*sum;
				System.out.println("for "+i+" no. of ways "+ans);
				
				
			}
		
	}

}
