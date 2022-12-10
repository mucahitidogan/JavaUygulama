package com.bilgeadam.week4.lesson001.bank;

public class CheckingAccount extends BankAccount{

	public CheckingAccount(String accountNumber, String accountName) {
		super(accountNumber, accountName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		
		balance +=amount;
		
	}

	@Override
	public void withdraw(double amount) {
		
		if(amount>balance)
		{
			System.out.println("Yetersiz bakiye!!!");
		}
		else
		{
			balance -= amount;
		}
	}
	
	

}
