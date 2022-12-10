package com.bilgeadam.week2.lesson001.ifelse;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("Kilonuz : ");
		double kilo = scan.nextDouble();
		System.out.print("Boyunuz : ");
		double boy = scan.nextDouble();
		System.out.print("Cinsiyetiniz : ");
		String cinsiyet = scan.next();
		double bmi = (kilo*10000)/(boy*boy);
		if (cinsiyet.equals("erkek"))
		{
			if(bmi<20)
			{
				System.out.println("Zayıf Erkek");
			}
			else if(bmi<25)
			{
				System.out.println("Normal Erkek");
			}
			else if(bmi<30)
			{
				System.out.println("Kilolu Erkek");
			}
			else
			{
				System.out.println("Obez Erkek");
			}
		}
		else if (cinsiyet.equals("kadın"))
		{
			if(bmi<19)
			{
				System.out.println("Zayıf Kadın");
			}
			else if(bmi<24)
			{
				System.out.println("Normal Kadın");
			}
			else if(bmi<30)
			{
				System.out.println("Kilolu Kadın");
			}
			else
			{
				System.out.println("Obez Kadın");
			}
		}
		else 
		{
			System.out.println("Hatalı cinsiyet girdiniz!!!");
		}
		

	}
}
