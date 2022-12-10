package com.bilgeadam.week3.lesson002.returnString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MethodString ms = new MethodString();
		
		ms.adSoyad("Kemal", "Öztürk");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("İlk kelimeyi giriniz : ");
		String k1 = scan.next();
		System.out.println("İkinci kelimeyi giriniz : ");
		String k2 = scan.next();
		
		UzunKelime uk = new UzunKelime();
		uk.UzunKelimeBul(k1, k2);

	}

}
