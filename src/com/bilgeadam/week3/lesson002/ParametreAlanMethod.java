package com.bilgeadam.week3.lesson002;



public class ParametreAlanMethod {
		
	public int  KucukSayiBul (int sayi1, int sayi2)
	{
		if(sayi1 < sayi2)
		{
//			System.out.println("Küçük sayı : "+sayi1);
			return sayi1;
		}
		else if (sayi2 < sayi1) 
		{
//			System.out.println("Küçük sayı : "+sayi2);
			return sayi2;
		}
		else
		{
//			System.out.println("Giriş yaptığınız sayilar eşit");
			return 0;
		}
		
	}

	
}
