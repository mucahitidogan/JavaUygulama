package com.bilgeadam.week3.lesson005.Bank;

public class Transfer extends BankAccount {

	public Transfer(String accountNo, String accountName, double balance) {
		super(accountNo, accountName, balance);
		// TODO Auto-generated constructor stub
	}
	public double Withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance-=amount;
			
			return balance;
		}
		else
		{
			System.out.println("You have insufficient balance!!!");
			
			return balance;
		}
		
	}
	public double Deposit(double amount)
	{
		balance+=amount;
		
		return balance;
	}
}
