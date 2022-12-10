package com.bilgeadam.week3.lesson002.ikiDegerArasiSayi;

public class SiraliSayi {

	public void ikiSayiArasiTopla (int sayi1,int sayi2)
	{
		int toplam = 0;
		for(int i = sayi1;sayi1<=sayi2;i++)
		{
			toplam +=i;
		}
		System.out.println("İki sayı arasındaki sayıların toplamı : "+toplam);	
	}
}
