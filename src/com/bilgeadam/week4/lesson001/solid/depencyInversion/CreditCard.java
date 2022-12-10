package com.bilgeadam.week4.lesson001.solid.depencyInversion;

public class CreditCard implements PaymentMethod {

	public void doTransaction (int amount)
	{
		System.out.println("tx done with creditcard"+amount);
	}
}
