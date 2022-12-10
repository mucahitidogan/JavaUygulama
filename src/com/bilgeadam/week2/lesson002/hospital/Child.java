package com.bilgeadam.week2.lesson002.hospital;

public class Child extends Person {

	@Override
	void checkUp() {
		
		System.out.println("Çocuğa şeker verildi."); 
		System.out.println("Kontrolleri yapıldı...");
	}

	@Override
	void examinePatient() {
		
		System.out.println("Oyun eşliğinde muayene yapıldı...");
		
	}

	
}
