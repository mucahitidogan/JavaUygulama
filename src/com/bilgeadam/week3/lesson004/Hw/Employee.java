package com.bilgeadam.week3.lesson004.Hw;


public class Employee {
	
	public String name;
	public String lastname;
	public String job;
	public double salary;
	public IMaasZam iMaasZam;
	

	public Employee(String name, String lastname, String job, double salary) {
		
		this.name = name;
		this.lastname = lastname;
		this.job = job;
		this.salary = salary;
		
	}

	
	
	public Employee(IMaasZam iMaasZam) {
		
		this.iMaasZam = iMaasZam;
	}



	public void Zam (double zamOrani)
	{
		iMaasZam.MaasZami(zamOrani);
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastname=" + lastname + ", job=" + job + ", salary=" + salary + "]";
	}


}
