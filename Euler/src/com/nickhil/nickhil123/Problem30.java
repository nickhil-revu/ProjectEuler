package com.nickhil.nickhil123;

public class Problem30 {

	/* Problem 30: Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
	 * 
	 * 
	 * Answer: 443839
	 */
	public static void main(String[] args) {
		
		int sum;
		
		/*for(int j=0;j<10;j++)
		{
			for(int i=0;i<10;i++)
			{
				for(int a=0;a<10;a++)
				{
					for(int b=0;b<10;b++)
					{
						for(int c=0;c<10;c++)
						{
							for(int d=0;d<10;d++)
							{
								int num = j*100000+i*10000+a*1000+b*100+c*10+d;
								//System.out.println(num);
								if(Math.pow(j, 5)+(Math.pow(i, 5)+Math.pow(a,5)+Math.pow(b, 5)+Math.pow(c,5)+Math.pow(d, 5))==num)
								{
									System.out.println("i--->"+i+":"+num);
									sum+=num;
								}
							}
						}
					}
				}
				
			}
		}
		
		System.out.println(sum);
		*/
		int n=2;
		sum=0;
		
		/* considering the algo for 7 digit number the largest num is 9999999 but the procedure results with 
		 * value 7 x (9^5) is a six digit number so it can be terminated
		 * 
		 * to optimize the algorithm further we may verify the result of 7 x (9^5) and terminate the while loop at 350000
		 */
		while(n<1000000)   
		{
			//System.out.println(n);
			if(n==power5(n))
			{
				System.out.println("*********"+n);
				sum+=n;
			}
			n++;
		}
		System.out.println(sum);
	}

	private static int power5(int n) {
		int power=0;
		while(n!=0)
		{
			int t=n%10;
			n=n/10;
			power+=Math.pow(t,5);
		}
		return power;
	}

}
