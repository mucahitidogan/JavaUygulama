package com.bilgeadam.week2.lesson001.polygon;

import java.util.Scanner;

import com.bilgeadam.lesson.MathLib;

public class Triangle implements Polygon{

	@Override
	public void alanHesapla(int kenar) {
		System.out.print("Kenar uzunlugu giriniz : ");
		Scanner scan = new Scanner(System.in);
		kenar = scan.nextInt();
		System.out.println("Ucgenin alani: "+Math.pow(kenar, 2)*Math.sqrt(3)/4);		
		
	}

	@Override
	public void kenarSayisi() {
		System.out.println("i have 3 sides");
		
	}

	

}
