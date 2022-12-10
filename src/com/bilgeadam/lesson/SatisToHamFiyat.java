package com.bilgeadam.lesson;

import java.util.Scanner;

public class SatisToHamFiyat {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Ürününüzün satış fiyatını giriniz : ");
		double satisFiyati,hamFiyat,kdvsizFiyati;
		int kdvOrani,karOrani;
		kdvOrani=18;
		karOrani=15;
		satisFiyati = scan.nextDouble();
		kdvsizFiyati=(satisFiyati*100)/100+kdvOrani;
		hamFiyat=((kdvsizFiyati)*100)/100+karOrani;
		System.out.printf("Ürününüzün ham fiyatı : "+"%.2f",hamFiyat);
		
	}

}
