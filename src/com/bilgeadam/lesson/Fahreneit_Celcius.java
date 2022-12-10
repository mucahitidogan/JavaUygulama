package com.bilgeadam.lesson;

import java.util.Scanner;

public class Fahreneit_Celcius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double f,c;
		System.out.println("Fahreneit değerini giriniz : ");
		f=scan.nextDouble();
		c=(f-32)/1.8;
		System.out.printf("Celcius : "+"%.2f",c);
	}

}
