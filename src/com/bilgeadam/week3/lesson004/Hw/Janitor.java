package com.bilgeadam.week3.lesson004.Hw;

public class Janitor extends Employee implements IMaasZam {

	public Janitor(String name, String lastname, String job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	public Janitor(IMaasZam iMaasZam) {
		super(iMaasZam);
		// TODO Auto-generated constructor stub
	}
	@Override
	public  void MaasZami(double zamOrani) {
		// TODO Auto-generated method stub
		double zamliMaas = salary + (salary * (zamOrani/100));
		
		System.out.println("Zam sonrası maas : " + zamliMaas);
	}
}
