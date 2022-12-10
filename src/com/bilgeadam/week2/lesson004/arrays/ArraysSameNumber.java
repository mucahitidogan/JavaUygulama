package com.bilgeadam.week2.lesson004.arrays;

public class ArraysSameNumber {

	public static void main(String[] args) {
		
		int[] sayi3= {3,7,12,43,54,43,28,3,19,-24,-19};
		int sayac = 0;
		for(int a = 0; a < sayi3.length; a++)
		{
			
			for(int b = a+1; b < sayi3.length; b++)
			{
				if(sayi3[a]==sayi3[b])
				{
					if (sayac==0) {
					System.out.println(sayi3[b]);
					sayac++;
					}
				}
			}
		}
		
		sayac=0;
	}

}
