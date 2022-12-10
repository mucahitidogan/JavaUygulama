package com.bilgeadam.week4.lesson001.bank;

public class SavingsAccount extends BankAccount{

	double interestRate;
	
	public SavingsAccount(String accountNumber, String accountName,double interestRate) {
		super(accountNumber, accountName);
		this.interestRate =interestRate;
	}
	
	public void addInterest()
	{
		double interest = this.balance*(this.interestRate/100);
		deposit(interest);
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
