package com.bilgeadam.week3.lesson001;

import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose");
		int input = scan.nextInt();
		
		while(input!=3) {
		
			switch (input){
		
			case 1:
			System.out.println("Merhaba");
			break;
		case 2:
			System.out.println("Güle güle");
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Yanlış giriş yaptınız");
			break;
		
		}
	}
}

}
