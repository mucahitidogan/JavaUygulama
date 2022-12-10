package com.bilgeadam.week2.lesson003.composition;
//Car has a Engine ---> composition tanımı
//composition aslında aggregationın(has a) katı  daha zorunlu halidir.
public class Car {
	
	public String name;
	public final Engine engine;
	
	public Car(String name, Engine engine) {
		
		this.name = name;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", engine=" + engine + "]";
	}
	
	

}
