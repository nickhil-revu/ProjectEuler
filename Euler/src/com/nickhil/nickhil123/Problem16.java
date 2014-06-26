package com.nickhil.nickhil123;

public class Problem16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n=(long) Math.pow(2,1000);
		System.out.println(n);
		int sum=0;
		while(n!=0)
		{
			int t= (int) (n%10);
			sum+=t;
			n=n/10;
		}
		System.out.println(sum);
	}

}
