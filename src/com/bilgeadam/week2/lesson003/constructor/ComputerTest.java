package com.bilgeadam.week2.lesson003.constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		//3 parametreli constructor **bir bilgisayarda bulunması  zorunlu özellikler
		Computer comp = new Computer(8.0,23.0,512.0);
		comp.ekranKarti=8.0;
		System.out.println(comp);
		
		Dell dell = new Dell(4.0,24.0,126.0);
		dell.ssd = 1024.0;
		dell.ekranKarti=16.0;
		System.out.println(dell);

	}

}
