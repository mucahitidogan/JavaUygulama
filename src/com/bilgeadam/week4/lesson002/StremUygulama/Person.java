package com.bilgeadam.week4.lesson002.StremUygulama;

public class Person {

	String name;
	String lastname;
	String gender;
	int age;
	
	public Person(String name, String lastname, String gender, int age) {
		
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.age = age;
	}
	public void speak ()
	{
		System.out.println("Hi! I am "+name);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	
}
