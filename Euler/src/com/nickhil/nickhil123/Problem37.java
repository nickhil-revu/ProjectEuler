package com.nickhil.nickhil123;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Problem37 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("C:\\Users\\Nickhil\\git\\ProjectEuler\\Euler\\text\\file37");
		OutputStreamWriter osr = new OutputStreamWriter(file);
		BufferedWriter br = new BufferedWriter(osr);
		String str = new String();
		//String revStr = new String();
		for(long i=37;i<100000000;i++)
		{
			str = ""+i;
			
			if(str.matches("3.*3")||str.matches("3.*7")||str.matches("7.*3")||str.matches("7.*7"))
			{
			  //StringBuilder sb = new StringBuilder(String.valueOf(i));
			  //revStr = sb.reverse().toString();
			  	if(isPrime(i))
			  		//if(isPrime(Integer.parseInt(revStr)))
			  			if(truncatablePrime(i))
			  				if(isRevTruncatablePrime(i))
			  					br.write(i+"\n");	
			  					//System.out.println(i);
			}
			else
			{
				continue;
			}
				
		}
		br.close();
		System.out.println("end");
	}

	

	










	private static boolean isPrime(long n) {
		int count =0;
		for(int i=1;i*i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==1)
			return true;
		return false;
	}
	
	private static boolean truncatablePrime(long n) {
		int i=6;
		while(i>0)
		{
			long num = (int) (n%(Math.pow(10, i--)));
			if(!isPrime(num))
				return false;
		}
		return true;
	}

	

	private static boolean isRevTruncatablePrime(long n) {
		long num = n;
		while(num!=0)
		{
			
			if(!isPrime(num))
				return false;
			num = num/10;
		}

		return true;
	}
}
