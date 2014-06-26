package com.nickhil.nickhil123;

/* Problem 17: If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. 
The use of "and" when writing out numbers is in compliance with British usage.
 * 
 * 
 * ANSWER: 21124
 */
public class Problem17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = new String[1002];
		for(int i=0;i<1002;i++)
			str[i]="0";
		str[0]="";
		str[1]="one";
		str[2]="two";
		str[3]="three";
		str[4]="four";
		str[5]="five";
		str[6]="six";
		str[7]="seven";
		str[8]="eight";
		str[9]="nine";
		str[10]="ten";
		str[11]="eleven";
		str[12]="twelve";
		str[13]="thirteen";
		str[14]="fourteen";
		str[15]="fifteen";
		str[16]="sixteen";
		str[17]="seventeen";
		str[18]="eighteen";
		str[19]="nineteen";
		str[20]="twenty";
		str[30]="thirty";
		str[40]="forty";
		str[50]="fifty";
		str[60]="sixty";
		str[70]="seventy";
		str[80]="eighty";
		str[90]="ninety";
		str[1001]="hundred";
		str[1000]="onethousand";
		
		int tot=0;
		int n,temp,temp2;
		
		for(int i=1;i<1001;i++)
		{ String s="";
			if(str[i].length()==1)
			{   n=i;
				
				if(n/100>=1)
				{
					s=s+str[n/100];
					s=s+str[1001];
					if(n%100!=0)
					{
						s=s+"and";
					    s=s+str[n%100];
					}
				}
			
				else
				{
					
					while(n!=0)
					{
					  temp=n%10;
					  s=s+str[temp];
					  
					  temp2=n-temp;
						  if(str[temp2].length()!=1)
						  {
							  s=str[temp2]+s;
							  break;
						  } 
					}
				  }
				str[i]=s;
			}	
		}
		
		for(int i=1;i<1001;i++)
		{
			/*	//Open this comment to print all the numbers
			 * System.out.println(i+" "+str[i]);
			 */
			//System.out.println(i+" "+str[i]+" "+str[i].length());
			tot+=str[i].length();
			
		}
			
		System.out.println(tot);
	}

}
