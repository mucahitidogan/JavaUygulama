package com.bilgeadam.week3.lesson002;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.println("Diğer sayıyı giriniz : ");
		int sayi2 = scan.nextInt();
		
		ParametreAlanMethod pam = new ParametreAlanMethod();
		pam.KucukSayiBul(sayi1,sayi2);

	}

}
