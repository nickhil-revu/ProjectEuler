package com.nickhil.nickhil123;

/* Problem 19: You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * 
 * ANSWER: 171
 */

public class Problem19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int day=2;
		int yr,mn;
		int count=0;
		for(yr=1901;yr<2001;yr++)
		{
			for(mn=1;mn<=12;mn++)
			{
				if(day==0)
				{
					count++;
					System.out.println(yr+"  "+mn);
				}	
				if(mn==1||mn==3||mn==5||mn==7||mn==8||mn==10||mn==12)
					day=day+3;
				else if(mn==4||mn==6||mn==9||mn==11)
					day=day+2;
				else if(yr%4==0&&mn==2)
					day=day+1;
 				
				day=day%7;
				
			}
		}
		System.out.println(count);
	}

}
