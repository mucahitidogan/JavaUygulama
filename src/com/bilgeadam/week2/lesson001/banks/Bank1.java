package com.bilgeadam.week2.lesson001.banks;

import java.util.Scanner;

public class Bank1 implements Bank{

	@Override
	public void faizOrani(double faiz) {
		
		System.out.println("Bank1 faiz orani : "+faiz);
		double anaPara;
		Scanner scan = new Scanner(System.in);
		anaPara=scan.nextDouble();
		System.out.println("Gunluk faiz getirisi : "+(anaPara/100)*(faiz/365));
		
		//(Anapara / 100) x (Faiz Oranı / 365)
	}

}
