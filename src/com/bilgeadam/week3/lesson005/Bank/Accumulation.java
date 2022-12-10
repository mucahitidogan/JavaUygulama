package com.bilgeadam.week3.lesson005.Bank;

public class Accumulation extends BankAccount {

	 
	public Accumulation(String accountNo, String accountName, double balance) {
		super(accountNo, accountName, balance);
		// TODO Auto-generated constructor stub
	}

	public double earnInterest(double interest)
	{
		double earnedInterest = balance * interest / 100;
		
		return earnedInterest;
	}
	
}
