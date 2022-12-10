package com.bilgeadam.week4.lesson001.solid.singleResponsibility;

public class NotificationService {

	public void sendOTP(String type)
	{
		if(type.equals("email"))
		{
			//email göndermekle ilgili implementasyon
			System.out.println("Email gönderildi!!!");
		}
		if(type.equals("sms"))
		{
			//email göndermekle ilgili implementasyon
			System.out.println("sms gönderildi!!!");
		}
		
	}
}
