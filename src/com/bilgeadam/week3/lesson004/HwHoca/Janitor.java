package com.bilgeadam.week3.lesson004.HwHoca;

public class Janitor extends Employee{

	public Janitor(String name, String lastname, Jobs job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void increaseSalary(double salary) {
		// TODO Auto-generated method stub
		salary = salary*1.1;
	}

}
