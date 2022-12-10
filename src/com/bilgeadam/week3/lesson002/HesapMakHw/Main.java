package com.bilgeadam.week3.lesson002.HesapMakHw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HesapMak hp = new HesapMak();
		Scanner scan = new Scanner(System.in);
		boolean deger  = true;
		while(deger) 
		{
			System.out.println("-------------------------------------------------"+"\n1 - Toplama"+"\n2 - Çıkarma"+"\n3 - Çarpma"+"\n4 - Bölme"+"\n5 - Mod"+"\n0 - Çıkış"+"\n-------------------------------------------------"+"\nYapmak istediğiniz işlemi türünü seçiniz : ");
			int input = scan.nextInt();
			if (input == 0)
			{
				deger = false;
				break;
			}
			hp.veriGirisi();
			switch (input) 
			{
			
				case 1: 
					
					System.out.println("Sayıların Toplamı : " + hp.sum()); 
					break;
				
				case 2:
					
					System.out.println("Sayıların Farkı : " + hp.diff());
					break;
				
				case 3:
					
					System.out.println("Sayıların Çarpımı : " + hp.multiply());
					break;
				
				case 4:
					
					System.out.println("Sayıların Bölümü : " + hp.divide());
					break;
				
				case 5:
					
					System.out.println("Sayıların Modu : " + hp.mod());
					break;
			
//				case 0: 
//					deger = false;				
//					break;
				
				default:
					System.out.println("Geçersiz işlem türü!");
			    	break;
				
				
			}
		
		}	

	}
	
}


