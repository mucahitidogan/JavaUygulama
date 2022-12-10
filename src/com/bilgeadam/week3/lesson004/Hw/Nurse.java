package com.bilgeadam.week3.lesson004.Hw;

public class Nurse extends Employee implements IMaasZam {

	public Nurse(String name, String lastname, String job, double salary) {
		super(name, lastname, job, salary);
		// TODO Auto-generated constructor stub
	}

	public Nurse(IMaasZam iMaasZam) {
		super(iMaasZam);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void MaasZami(double zamOrani) {
		// TODO Auto-generated method stub
		double zamliMaas = salary + (salary * (zamOrani/100));
		
		System.out.println("Zam sonrası maas : " + zamliMaas);
		
	}
		
	}


