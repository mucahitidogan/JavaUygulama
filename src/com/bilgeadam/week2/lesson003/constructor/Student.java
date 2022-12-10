package com.bilgeadam.week2.lesson003.constructor;

public class Student extends Person{
	
	public int grade;

	public Student(String name, int age, String occupation, double salary, int grade) {
		super(name, age, occupation, salary);
		this.grade = grade;
	}

	
}
