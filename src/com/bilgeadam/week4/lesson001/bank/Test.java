package com.bilgeadam.week4.lesson001.bank;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account1 = new CheckingAccount("Vsiz10001", "Cagrinin Vsiz hesabi");
		SavingsAccount account2 = new SavingsAccount("Vli10001", "Cagrinin Vli hesabi",14);
		
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(account1);
		accounts.add(account2);
		
		Bank bank = new Bank("HSBC",accounts);
		
		System.out.println(bank);
		
		for (BankAccount bankAccount : bank.accounts)
			if(bankAccount instanceof SavingsAccount)
			{
				System.out.println(bankAccount);
			}
		
	}

}
