package com.bilgeadam.week3.lesson002.MetodOrnek;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Rank rank = new Rank();
		
		System.out.println("Bir sayı giriniz : ");
		double deger = scan.nextDouble();
		System.out.println(rank.rankBelirle(deger)); 

	}

}
