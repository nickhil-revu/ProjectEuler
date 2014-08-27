package com.nickhil.nickhil123;

import java.util.ArrayList;

/* Problem 26: A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 * 
 * 
 * Answer : 983
 */
public class Problem26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*BigDecimal ans;
		for(long i=900;i<1000;i++)
		{
			
			//DecimalFormat df = new DecimalFormat("#.000000000000000000000000000000000000000000000000000");
			//ans=df.format(1/(double)i);
			ans=BigDecimal.valueOf(1).divide(BigDecimal.valueOf(i),100, RoundingMode.HALF_UP);
			System.out.println(i+" " +ans);
		}*/
		int n,n1;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count=0;
		for(int i=992;i>0;i--)
		{
			if(i>100)
			{
				n=1000%i;
				 
				while(n!=0&&!arr.contains(n))
				{
					arr.add(n);
					if(n<10)
					    {
						count+=3;
						n1=n*1000%i;
						}
					else if(n<100)
					{
						count+=2;
						n1=n*100%i;
					}
					else
					{
						count++;
						n1=n*10%i;
					}
					n=n1;
					//System.out.println(n1);
				}
				System.out.println(i +"    "+count);
				arr.clear();
				count=0;
			}
		}
	
	
	
	}

}
