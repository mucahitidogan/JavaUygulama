package com.bilgeadam.week3.lesson004.Hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Doctor doctor = new Doctor("Ahmet", "Keskin", "Doctor", 20000.0);
		Employee empDoctor = new Employee(doctor);
		System.out.println(doctor);
		empDoctor.Zam(40.0);
		Doctor doctor1 = new Doctor("Murat", "Dogan", "Doctor", 20000.0);
		Employee empDoctor1 = new Employee(doctor1);
		System.out.println(doctor1);
		empDoctor1.Zam(40.0);
		Manager manager = new Manager("Kerem","Yildiz","Manager",17000.0);
		Employee empManager = new Employee(manager);
		System.out.println(manager);
		empManager.Zam(30.0);
		Manager manager1 = new Manager("Ayberk","Unal","Manager",17000.0);
		Employee empManager1 = new Employee(manager1);
		System.out.println(manager1);
		empManager1.Zam(30.0);
		Nurse nurse = new Nurse("Merve","Gonul","Nurse",8000.0);
		Employee empNurse = new Employee(nurse);
		System.out.println(nurse);
		empNurse.Zam(20.0);
		Nurse nurse1 = new Nurse("Gamze","Kahraman","Nurse",8000.0);
		Employee empNurse1 = new Employee(nurse1);
		System.out.println(nurse1);
		empNurse1.Zam(20.0);
		Janitor janitor = new Janitor("Hasan","Yucel","Janitor",6000.0);
		Employee empJanitor = new Employee(janitor);
		System.out.println(janitor);
		empJanitor.Zam(10.0);
		Janitor janitor1 = new Janitor("Seher","Bilgen","Janitor",6000.0);
		Employee empJanitor1 = new Employee(janitor1);
		System.out.println(janitor1);
		empJanitor1.Zam(10.0);
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(doctor);
		employee.add(doctor1);
		employee.add(manager);
		employee.add(manager1);
		employee.add(nurse);
		employee.add(nurse1);
		employee.add(janitor);
		employee.add(janitor1);
		
		List<Employee> managerList = employee.subList(2, 4);
		
		for(Employee emplo : employee)
		{
			System.out.print(emplo+" ----- Zam sonrasi Maasi -----> ");
		}
		
		
		

	}

}
