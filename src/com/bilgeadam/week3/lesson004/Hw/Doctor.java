package com.bilgeadam.week3.lesson004.Hw;

public class Doctor extends Employee implements IMaasZam {

	public Doctor(String name, String lastname, String job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	public Doctor(IMaasZam iMaasZam) {
		super(iMaasZam);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void MaasZami(double zamOrani) {
		// TODO Auto-generated method stub
		double zamliMaas = salary + (salary * (zamOrani/100));
		
		System.out.println("Zam sonrasi maas : " + zamliMaas);
	}



}
