package com.bilgeadam.week2.lesson003.constructor;

public class Person {

	public String name;
	public int age;
	public String occupation;
	public double salary;
	
	//Shift+Alt+S
	//Generate constructor superclass
	public Person() {
		
	}
	//Shift+Alt+S
	//Generate constructor field

	public Person(String name, int age, String occupation, double salary) {
		
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		this.salary = salary;
	}

	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + ", salary=" + salary + "]";
	}
	
	
	
	
}
