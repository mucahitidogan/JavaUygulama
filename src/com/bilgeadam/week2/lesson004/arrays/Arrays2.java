package com.bilgeadam.week2.lesson004.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int[] sayi = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		int toplam = 0;
		int bolen=1;
		for (int i = 0; i < sayi.length; i++ ) {
			
			toplam+=sayi[i];
			bolen+=1;
		}
		System.out.println("Toplam : "+toplam+"\nOrtalama : "+toplam/bolen);
		
		int[] sayi2= {56,34,1,8,101, -2, -33};
		int min=sayi2[0],max=sayi2[0];
		for (int j = 0; j < sayi2.length; j++ ) {
			
			if(min>sayi2[j])
			{
				min=sayi2[j];
			}
			if(max<sayi2[j])
			{
				max=sayi2[j];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : "+max);
		
		
		
		
		
	}

}
