package com.bilgeadam.week3.lesson002.MetodOrnek2;

public class OddOrEven {

	public boolean tekCiftBul(int sayi)
	{
		if(sayi%2==0)
		{
			System.out.println("Girdiğiniz sayı çifttir ---> True");
			return true;
		}
		else
		{
			System.out.println("Girdiğiniz sayı tektir ---> False");
			return false;

		}
	}
}
