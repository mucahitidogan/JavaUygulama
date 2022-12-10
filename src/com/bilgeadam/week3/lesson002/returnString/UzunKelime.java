package com.bilgeadam.week3.lesson002.returnString;

public class UzunKelime {
	
	public String UzunKelimeBul(String k1, String k2)
	{
		if(k1.length()<k2.length())
		{
			System.out.println("Uzun kelime : "+k2);
			return k2;
		}
		else if (k2.length()<k1.length())
		{
			System.out.println("Uzun kelime : "+k1);
			return k1;
		}
		else
		{
			String esit = "Kelimeler eşit uzunlukta!";
			System.out.println(esit);
			return esit;
			
		}
		
	}

}
