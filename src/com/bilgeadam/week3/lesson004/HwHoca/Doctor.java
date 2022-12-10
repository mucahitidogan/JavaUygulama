package com.bilgeadam.week3.lesson004.HwHoca;

public class Doctor extends Employee{

	public Doctor(String name, String lastname, Jobs job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseSalary(double salary) {
		
		salary = salary*1.4;
		
	}

}
