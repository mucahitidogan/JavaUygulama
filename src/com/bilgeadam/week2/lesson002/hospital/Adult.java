package com.bilgeadam.week2.lesson002.hospital;

public class Adult extends Person {

	@Override
	void checkUp() {
		System.out.println("Sağlık kontrolü yapıldı...");
		
	}

	@Override
	void examinePatient() {
		System.out.println("Hasta muayenesi yapıldı...");
		
	}
	

}
