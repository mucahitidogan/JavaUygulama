package com.bilgeadam.week2.lesson002.hospital;

public class Test {

	public static void main(String[] args) {

		Child child =new Child();
		child.name="Mucahit";
		child.age=15;
		child.isHealty=false;
		
		child.checkUp();
		
		Adult adult =new Adult();
		adult.isHealty=true;
		adult.checkIfHealty();
		

	}

}
