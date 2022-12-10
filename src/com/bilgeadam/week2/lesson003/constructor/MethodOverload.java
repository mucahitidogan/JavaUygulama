package com.bilgeadam.week2.lesson003.constructor;

public class MethodOverload {

	public static void display(int a) {
		
		System.out.println("i have a integer data : " + a);
	}
	
	public static void display(String name) {
		
		System.out.println("i have a string data : " + name);
	}
    
	public static void display(String name, int age) {
		
		System.out.println(name +"'nin yasi "+age+"dir.");
	}
	
	public static void main(String[] args) {
		
		display(3);
		display("Mucahit");
		display("Mucahit",28);
	}
}
