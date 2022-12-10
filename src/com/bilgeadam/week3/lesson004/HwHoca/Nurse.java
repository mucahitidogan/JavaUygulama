package com.bilgeadam.week3.lesson004.HwHoca;

public class Nurse extends Employee{

	public Nurse(String name, String lastname, Jobs job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseSalary(double salary) {
		// TODO Auto-generated method stub
		salary = salary*1.2;
	}

}
