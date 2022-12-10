package com.bilgeadam.lesson;

import java.util.Scanner;

public class Ucgen_Kenar_Aci_Hsaplama {

	public static void main(String[] args) {
			
		Scanner scan=new Scanner(System.in);
		
		double aci1,aci2,aci3, kenar1,kenar2, kenar3;
		
		System.out.println("Enter first angle : ");
		aci1 = scan.nextDouble();
		System.out.println("Enter second angle : ");
		aci2 = scan.nextDouble();
		System.out.println("Enter line lenght for first angle : ");
		kenar1 = scan.nextDouble();
		System.out.println("Enter line lenght for second angle : ");
		kenar2 = scan.nextDouble();
		
		aci3=180-(aci1+aci2);
		
		double kenar3Karesi;
		double aci3Radyan=Math.toRadians(aci3);
		kenar3Karesi=(Math.pow(kenar1, 2))+(Math.pow(kenar2, 2))-2*(kenar1*kenar2)*(Math.cos(aci3Radyan));
		kenar3=Math.sqrt(kenar3Karesi);
		
		System.out.println("Uzun kenarın değeri : " + kenar3);
		

	}

}
