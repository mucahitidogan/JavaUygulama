package com.bilgeadam.lesson;

import java.util.Scanner;

public class WhatsYourName {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen adınızı giriniz : ");
		String name = scan.nextLine();
		System.out.println("Hoşgeldin "+name);
		
	}

}
