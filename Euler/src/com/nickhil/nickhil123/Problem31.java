package com.nickhil.nickhil123;

/* Problem 31: In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 * 
 * 
 * Answer:73682
 */
public class Problem31 {
	public static void main(String[] nickhil){
		int count=0;
		long start = System.currentTimeMillis();
		for(int i1=0;i1<=1;i1++)
		{
			for(int i2=0;i2<=2;i2++)
			{
				for(int i3=0;i3<=4;i3++)
				{
					for(int i4=0;i4<=10;i4++)
					{
						for(int i5=0;i5<=20;i5++)
						{
							for(int i6=0;i6<=40;i6++)
							{
								for(int i7=0;i7<=100;i7++)
								{
									for(int i8=0;i8<=200;i8++)
									{
										int value = (i1*200)+(i2*100)+(i3*50)+(i4*20)+(i5*10)+(i6*5)+(i7*2)+(i8*1);
										if(value == 200)
											count++;
										if(value>200)
											break;
									}
								}
							}
						}
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time in milli Seconds:"+(end-start));
		System.out.println(count);
	}
	
}
