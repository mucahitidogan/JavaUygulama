package com.bilgeadam.week3.lesson003.BankAtm;

import java.util.Scanner;

public class BankAtm {

	static Scanner scan = new Scanner(System.in);
	static int balance = 1500;
	static int count = 3;
	static String userName = "user";
	static String password = "123";
	static int selection;
	static int amount;
	static boolean condition = true;
	
	public static void main(String[] args) {
		
		while(condition)
		{
			System.out.println("Lutfen kullanici adinizi giriniz : ");
			String userNameInput = scan.nextLine();
			System.out.println("Lutfen sifrenizi giriniz : ");
			String passwordInput = scan.nextLine();
			count--;
			
			if(userNameInput.equals(userName) && passwordInput.equals(password))
			{
				System.out.println("Bankamiza hosgeldiniz!");
				
				while(true)
				{
		
				System.out.println("1 - Para Yatirma\n2 - Para Cekme\n3 - Bakiye Sorgulama\n4 - Cikis Yap");
				
				selection = scan.nextInt();
				
				switch (selection) {
				case 1:
					depositMoney();
					break;
				
				case 2:
					withdrawMoney();
					break;
				
				case 3:
					showBalance();
					break;
				
				case 4:
					systemExit();
					break;
				
				default:
					System.out.println("Gecersiz bir giriş yaptiniz");
					break;
					}
				
				}
			}	
			else
			{
				System.out.println("Kullanici adi veya sifresi hatali!");
				if(count == 0)
				{
					System.out.println("Kartiniz bloke olmuştur. Lutfen bankaniz ile iletisime gecin");
					condition = false;
				}
				else
				{
					System.out.println("Kalan hakkiniz : "+count);			
				}
			}
		}
		
		
		
	}
	
	public static void depositMoney()
	{
		System.out.println("Lutfen yatirmak istediginiz miktari giriniz : ");
		amount = scan.nextInt();
		balance = balance + amount;
		System.out.println("Hesabiniza " + amount + " TL para yatirilmistir");
	}
	
	public static void withdrawMoney()
	{
		System.out.println("Lutfen cekmek istediginiz miktari giriniz : ");
		amount = scan.nextInt();
		if(amount>balance)
		{
			System.out.println("Hesabinizda yeterli bakiye bulunmamaktadir");
		}
		else
		{			
			balance = balance - amount;
			System.out.println("Hesabinizdan " + amount + " TL para cekilmistir");
		}
	}
	
	public static void showBalance()
	{
		System.out.println("Hesabinizda toplam "+balance+" TL bakiye bulunmaktadir");
	}
	public static void systemExit()
	{
		System.out.println("Sistemden cikiliyor");
		
	}
	
	
	
	

}
