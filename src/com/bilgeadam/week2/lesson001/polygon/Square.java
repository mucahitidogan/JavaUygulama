package com.bilgeadam.week2.lesson001.polygon;

import java.util.Scanner;

public class Square implements Polygon {

	@Override
	public void alanHesapla(int kenar) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kenar uzunlugu giriniz : ");
		kenar = scan.nextInt();
		System.out.println("Dikdortgenin alani : "+kenar*kenar);
		
	}

	@Override
	public void kenarSayisi() {
		
		System.out.println("i have 4 sides");
		
	}

}
