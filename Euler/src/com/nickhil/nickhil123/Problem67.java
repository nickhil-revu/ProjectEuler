package com.nickhil.nickhil123;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*Problem 18: By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

*3
*7 4
2 *4 6
8 5 *9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

* Input: file5
* 
*ANSWER: 7273
*/

public class Problem67 {
public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Nickhil\\git\\ProjectEuler\\Euler\\text\\file5");
		InputStreamReader isr = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(isr);
		int[][] a =new int[100][100];
		int i=0;String str;
		int max=0,index=0,sum=0;
		while((str=br.readLine())!=null)
		{
			String s[]=(str.split(" "));
			for(int j=0;j<s.length;j++)
				a[i][j]=Integer.parseInt(s[j]);
			i++;
		}
		
	
		/*sum+=a[0][0];
		for(i=1;i<100;i++)
		{
			max=a[i][index]>a[i][index+1]?a[i][index]:a[i][index+1];
			index=a[i][index]>a[i][index+1]?index:index+1;
			sum+=max;
		}
		System.out.println(sum);*/
		
		for(i=98;i>=0;i--)
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

private static int max(int a, int b)
{
	return (a>b?a:b);
}
}

