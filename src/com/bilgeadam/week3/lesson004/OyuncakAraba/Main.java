package com.bilgeadam.week3.lesson004.OyuncakAraba;

import java.util.Scanner;

public class Main {
	
	static boolean condition = true;
	
	public static void main(String[] args) {
		OyuncakAraba oa = new OyuncakAraba();
		Scanner scan = new Scanner(System.in);
		
		while(condition)
		{
			System.out.println("1 - X ileri yonunde hareket et\n2 - Y sag yonunde hareket et\n3 - X geri yonunda hareket et\n4 - Y sol yonunda hareket et\n5 - Sarj et\n0 - Cikis Yap"+"\n-------------------------------------------------------");
			int selection = scan.nextInt();
			switch(selection)
			{
			
				case 1: 
					oa.hareketX();
					break;
				case 2: 
					oa.hareketY();
					break;
				case 3: 
					oa.hareketEksiX();
					break;
				case 4: 
					oa.hareketEksiY();
					break;
				case 5: 
					oa.sarjEt();
					break;
				case 0: 
					condition=false;
					break;
				default:
					System.out.println("Hatali giris yaptiniz!!!");
					break;
			
			}
		}
		System.out.println("Araba kapandi!");
	}

	

}
