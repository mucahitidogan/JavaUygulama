package com.bilgeadam.week4.lesson001.solid.openClosedPrinciple;

public interface NotificationService {

	public void sendOTP(String type);
	
	public void sendTransactionNotification(String Type);
}
