package com.bilgeadam.week2.lesson003.constructor;

public class Test {

	public static void main(String[] args) {
		
		//Parametresiz constructorla oluşturduğum person
		Person person = new Person();
		person.age = 20;
		person.name = "John";
		person.occupation = "Student";
		person.salary = 1000;
		System.out.println(person);
		
		//Bütün parametreli constructorla oluşturduğum person
		Person person2 = new Person("Çağrı",28,"Teacher",1000);
		System.out.println(person2);
		
		//2parametreli constructorla oluşturduğum person
		Person person3 = new Person("Mucahit",35);
		person3.occupation = "Student";
		System.out.println(person3);
	
		
	}

}
