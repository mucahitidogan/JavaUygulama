package com.bilgeadam.week2.lesson004;

public class Test {
	
	public static void main(String[] args) {
		
		Course math = new Course("Mat101", " Fundamentals of Algebra");
		Course java = new Course("JavaSE", " Fundamentals of Java");
		
		Address address1 = new Address("İstanbul","Şişli");
		Student student1 = new Student(1L,"Mucahit",math);
		student1.address=address1;
		System.out.println(student1);
		
	}

}
