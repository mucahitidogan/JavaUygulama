package com.bilgeadam.week4.lesson001.bank;

public abstract class BankAccount implements BankingOperations {

	String accountNumber;
	String accountName;
	double balance;
	
	public BankAccount(String accountNumber, String accountName) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance
				+ "]";
	}
	
	
}
