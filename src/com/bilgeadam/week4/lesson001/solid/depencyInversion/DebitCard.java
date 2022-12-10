package com.bilgeadam.week4.lesson001.solid.depencyInversion;

public class DebitCard  implements PaymentMethod {

	public void doTransaction (int amount)
	{
		System.out.println("tx done with debitcard"+amount);
	}
}
