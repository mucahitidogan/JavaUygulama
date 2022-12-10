package com.bilgeadam.week3.lesson002.HesapMakHw;

import java.util.Scanner;

public class HesapMak {

	double sonuc = 0;
	double sayi1;
	double sayi2;
	Scanner scan = new Scanner(System.in);
	
	public void veriGirisi()
	{
		System.out.print("İlk sayıyı giriniz : ");
		sayi1 = scan.nextDouble();
		System.out.print("İkinci sayıyı giriniz : ");
		sayi2 = scan.nextDouble();
		
	}
	
	public double sum() 
	{
		
		sonuc = sayi1 + sayi2;
		return sonuc;
	}
	public double diff() 
	{
		sonuc = sayi1 - sayi2;
		return sonuc;
	}
	public double multiply() 
	{
		sonuc = sayi1 * sayi2;
		return sonuc;
	}
	public double divide()  
	{
		sonuc = sayi1 / sayi2;
		return sonuc;
	}
	public double mod()  
	{
		sonuc = sayi1 % sayi2;
		return sonuc;
	}
}
