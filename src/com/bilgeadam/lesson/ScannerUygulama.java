package com.bilgeadam.lesson;

import java.util.Scanner;

public class ScannerUygulama {

	public static void main(String[] args) {
		
		int number;
		System.out.println("Please enter a number : ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		System.out.println("Number you Choose : "+ number);
		scan.close();

	}

}
