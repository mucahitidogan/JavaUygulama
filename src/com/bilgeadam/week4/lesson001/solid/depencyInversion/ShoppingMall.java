package com.bilgeadam.week4.lesson001.solid.depencyInversion;

public class ShoppingMall {

	public PaymentMethod paymentMethod;;

	public ShoppingMall(PaymentMethod paymentMethod) 
	{
		this.paymentMethod = paymentMethod;
	}
	
	public void doPayment(int amount)
	{
		paymentMethod.doTransaction(amount);
	}
	
}
