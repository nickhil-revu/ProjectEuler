package com.nickhil.nickhil123;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*Problem13: Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *           from file2
 * 
 * 
 * ANSWER: 5537376230
 */
public class Problem13 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Nickhil\\git\\ProjectEuler\\Euler\\text\\file2");
		InputStreamReader isr = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(isr);
		String str;
		long start = System.nanoTime();
		BigInteger sum = BigInteger.valueOf(0),num;
		
		while((str=br.readLine())!=null)
		{
			//num = BigInteger.valueOf(Long.parseLong(str.substring(0,15)));
			num = new BigInteger(str);
			sum=sum.add(num);
			
		}
		br.close();
		long end=System.nanoTime();
		NumberFormat f = new DecimalFormat("#0.0000");
		
		System.out.println(sum);
		System.out.println("Time Taken: "+f.format(((end-start)/1000000000d)));

	}

}
