package com.bilgeadam.week2.lesson001.bank2;

public class Test {

	public static void main(String[] args) {

		Ziraat ziraat = new Ziraat();
		System.out.println(ziraat.rateOfInterest());
		
		Garanti g = new Garanti();
		float rate =g.rateOfInterest();
		System.out.println(rate);

	}

}
