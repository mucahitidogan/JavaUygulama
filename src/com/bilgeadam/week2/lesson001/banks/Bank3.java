package com.bilgeadam.week2.lesson001.banks;

import java.util.Scanner;

public class Bank3 implements Bank{

	@Override
	public void faizOrani(double faiz) {
		
		System.out.println("Bank3 faiz orani : "+faiz);
		double anaPara;
		Scanner scan = new Scanner(System.in);
		anaPara=scan.nextDouble();
		System.out.println("Gunluk faiz getirisi : "+(anaPara/100)*(faiz/365));
	}
}
