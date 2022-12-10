package com.bilgeadam.week4.lesson001.solid.depencyInversion;

public class Test {

	public static void main(String[] args) {
		
		CreditCard creditCard = new CreditCard();
		DebitCard debitCard = new DebitCard();
		
		ShoppingMall shoppinMall = new ShoppingMall(debitCard);
		
		shoppinMall.doPayment(100);
	}
}
