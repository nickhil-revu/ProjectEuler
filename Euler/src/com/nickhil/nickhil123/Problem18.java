package com.nickhil.nickhil123;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* Problem 18: By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

   *3
  *7 4
 2 *4 6
8 5 *9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

               75
              95 64
             17 47 82
            18 35 87 10
           20 04 82 47 65
         19 01 23 75 03 34
        88 02 77 73 07 63 67
       99 65 04 28 06 16 70 92
      41 41 26 56 83 40 80 70 33
     41 48 72 33 47 32 37 16 94 29
    53 71 44 65 25 43 91 52 97 51 14
   70 11 33 28 77 73 17 78 39 68 17 57
  91 71 52 38 17 14 91 43 58 50 27 29 48
 63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, 
Problem 67, is the same challenge with a triangle containing one-hundred rows;
 it cannot be solved by brute force, and requires a clever method! ;o) 
 * 
 * Input: file3
 * 
 * ANSWER: 1074
 */
public class Problem18 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 
		FileInputStream file = new FileInputStream("C:\\Users\\Nickhil\\git\\ProjectEuler\\Euler\\text\\file3");
		InputStreamReader isr = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(isr);
		int[][] a =new int[15][15];
		int i=0;String str;
		int max=0,index=0,sum=0;
		while((str=br.readLine())!=null)
		{
			String s[]=(str.split(" "));
			for(int j=0;j<s.length;j++)
				a[i][j]=Integer.parseInt(s[j]);
			i++;
		}
		br.close();
		for(i=0;i<15;i++)
		{
			for(int j=0;j<=i;j++)
		{
			System.out.print(" "+a[i][j]);
			
		}
			System.out.println();
		}
		
		/*for(i=0;i<15;i++)
		{
			max=a[i][index]>a[i][index+1]?a[i][index]:a[i][index+1];
			index=a[i][index]>a[i][index+1]?index:index+1;
			sum+=max;
			System.out.println(max);
		}
		System.out.println("sum "+sum);*/
		
		for(i=13;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
			a[i][j]+=max(a[i+1][j],a[i+1][j+1]);
			System.out.print(" "+a[i][j]);
			}
			System.out.println();

		}
		System.out.println(a[0][0]);
	}
	 
	private static int max(int a,int b)
	{
		return (a>b?a:b);
	}
}
