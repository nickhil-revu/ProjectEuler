package com.nickhil.nickhil123;

/* Problem 24: A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

012   021   102   120   201   210

What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?


 * 
 * 
 * Answer: 2783915460
 */
public class Problem24 {
	public static void main(String[] args) 
	{
		
		
		
		
	/*	For 3 digits
	 * 
	 * int n1=0,n2 = 0,n3;
		for(int i=0;i<3;i++)
		{
			n1=i;
			for(int j=0;j<3;j++)
			{	
				//if(i!=j)
					n2=n1*10+j;
				
				for(int k=0;k<3;k++)
				{
					String str;
					n3=n2*10+k;
					if(n3<100)
					 str="0"+n3;
					else
						 str=""+n3;
					 if(checkUnique(str.toCharArray())&&str.length()==3)
						{
						 System.out.println(str);
						}
				}
					
			}
			
			//System.out.println();
		}*/
	
		
		long n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n0=0;
		long i1,i2,i3,i4,i5,i6,i7,i8,i9,i0;
		long count=0;
		for( i0=2;i0<10;i0++)
		{
			n0=i0;
			for(i1=0;i1<10;i1++)
			{
				n1=n0*10+i1;
				if(i0!=i1)
				{
					for(i2=0;i2<10;i2++)
					{
						if(i0!=i2&&i1!=i2)
						{
							n2=n1*10+i2;
							for(i3=0;i3<10;i3++)
							{
								if(i0!=i3&&i1!=i3&&i2!=i3)
								{
									n3=n2*10+i3;
									for(i4=0;i4<10;i4++)
									{
										
										n4=n3*10+i4;
										for(i5=0;i5<10;i5++)
										{
											n5=n4*10+i5;
											for(i6=0;i6<10;i6++)
											{
												n6=n5*10+i6;
												for(i7=0;i7<10;i7++)
												{
													n7=n6*10+i7;
													for(i8=0;i8<10;i8++)
													{
														n8=n7*10+i8;
														for(i9=0;i9<10;i9++)
														{
															n9=n8*10+i9;
															String str;
															if(i0==0)
															     str = "0"+n9;
															else
																 str = ""+n9;
																				
															if(str.length()==10&&checkUnique(str.toCharArray()))
															{
																
																count++;
																if(count==274240)// equal to 1000000 if i0 starts from 0
																   System.out.println(i0+"---->"+str);
															}
														}
													}
												}
											}
										}
									}
								}//close of if block (i3)// optimization
								
							}
						}//close of if block(i2)// optimization
						
					}
				}// close of if block (i0=i1)// optimization
		
			}
			System.out.println("inc i0");
		}
	
	}
	
	static boolean checkUnique(char arr[])
	{
	    int point = 0; //all elements before this point are unique for sure
	 
	    for(int i = 0; i < arr.length; ++i) // for each element, we are gonna compare to each unique element
	    {
	        char c = arr[i];
	 
	        for(int j = 0; j < point; ++j)
	        {
	            if(c == arr[j]) {
	                return false;
	            }
	        }
	        ++point; // at this time we now have a new unique element
	    }
	    return true;
	}

}
//--->2783915460