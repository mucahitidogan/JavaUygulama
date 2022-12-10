package com.bilgeadam.week2.lesson004;

public class Student extends Person{
	
	public Course course;
	
	public Student(long id, String name, Course course) {
		super(id, name);
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	

}
