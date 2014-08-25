package com.nickhil.nickhil123;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* PROBLEM 22:Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 *  begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its 
 *  alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name 
in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 * 
 * 
 * ANSWER: 871198282
 */
public class Problem22 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Nickhil\\git\\ProjectEuler\\Euler\\text\\names");
		InputStreamReader isr = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(isr);
		ArrayList<String> names = new ArrayList<String>();
		String[] str = br.readLine().split(",");
		for(String s:str)
		{
			names.add(s.substring(1,(s.length()-1)));
			//System.out.println(s.substring(1,(s.length()-1)));
		}
		Collections.sort(names);
		int score,totalScore=0;
		for(int i=0;i<names.size();i++)
		{
			score = myScore(names.get(i));
			totalScore += (i+1)*score;
		}
		System.out.println(totalScore);
	}

	public static int myScore(String str)
	{
		char[] ch = new char[str.length()];
		int dst =0;
		int temp=0,score=0;
		str.getChars(0, str.length(),ch, dst);
		for(int i=0;i<str.length();i++)
		{
			switch(ch[i])
			{
			case 'A': temp = 1; break;
			case 'B': temp = 2; break;
			case 'C': temp = 3; break;
			case 'D': temp = 4; break;
			case 'E': temp = 5; break;
			case 'F': temp = 6; break;
			case 'G': temp = 7; break;
			case 'H': temp = 8; break;
			case 'I': temp = 9; break;
			case 'J': temp = 10; break;
			case 'K': temp = 11; break;
			case 'L': temp = 12; break;
			case 'M': temp = 13; break;
			case 'N': temp = 14; break;
			case 'O': temp = 15; break;
			case 'P': temp = 16; break;
			case 'Q': temp = 17; break;
			case 'R': temp = 18; break;
			case 'S': temp = 19; break;
			case 'T': temp = 20; break;
			case 'U': temp = 21; break;
			case 'V': temp = 22; break;
			case 'W': temp = 23; break;
			case 'X': temp = 24; break;
			case 'Y': temp = 25; break;
			case 'Z': temp = 26; break;
						
			}
			score +=temp;
		}
		//System.out.println(score);
		return score;
	}
	
}
