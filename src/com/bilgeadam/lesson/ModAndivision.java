package com.bilgeadam.lesson;

import java.util.Scanner;

public class ModAndivision {

	public static void main(String[] args) {

		double a,b;
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter first number : ");
		a=scan.nextDouble();
		System.out.println("Please enter second number : ");
		b=scan.nextDouble();
		
		double div = a/b;
		double mod = a%b;
		
		System.out.println("Sayıların bölümü : "+div+"\nSayıların modu : "+mod);
	}

}
