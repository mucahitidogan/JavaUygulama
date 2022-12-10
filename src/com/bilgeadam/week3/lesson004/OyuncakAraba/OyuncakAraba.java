package com.bilgeadam.week3.lesson004.OyuncakAraba;

public class OyuncakAraba {

	static int batteryCapacity=5;
//	public int distanceX;
//	public int distanceY;
	static int x=0,y=0;
	
	public static void kalanBataryaOmru ()
	{
		System.out.println("Kalan batarya omru : "+batteryCapacity);
	}
	
	public void hareketX ()
	{
		if(batteryCapacity>0 && batteryCapacity<=5 )
		{
		x++;
		System.out.println("Konumunuz: ("+x+","+y+")");
		batteryCapacity--;
		kalanBataryaOmru();
		}
		else 
		{
			System.out.println("Bataryaniz zayif lutfen sarj edin!");
			System.out.println("Konumunuz: ("+x+","+y+")");
		}
				
	}
	
	public void hareketEksiX ()
	{
		if(batteryCapacity>0 && batteryCapacity<=5 )
		{
		x--;
		System.out.println("Konumunuz: ("+x+","+y+")");
		batteryCapacity--;
		kalanBataryaOmru();
		}
		else 
		{
			System.out.println("Bataryaniz zayif lutfen sarj edin!");
			System.out.println("Konumunuz: ("+x+","+y+")");
		}
	}
	public void hareketEksiY ()
	{
		if(batteryCapacity>0 && batteryCapacity<=5 )
		{
		y--;
		System.out.println("Konumunuz: ("+x+","+y+")");
		batteryCapacity--;
		kalanBataryaOmru();
		}
		else 
		{
			System.out.println("Bataryaniz zayif lutfen sarj edin!");
			System.out.println("Konumunuz: ("+x+","+y+")");
		}
	}
	public void hareketY ()
	{
		if(batteryCapacity>0 && batteryCapacity<=5)
		{
			y++;
			System.out.println("Konumunuz: ("+x+","+y+")");
			batteryCapacity--;
			kalanBataryaOmru();
		}
		else 
		{
			System.out.println("Bataryaniz zayif lutfen sarj edin!");
			System.out.println("Konumunuz: ("+x+","+y+")");
		}
		
	}
	
	public void sarjEt ()
	{
		if(batteryCapacity==5)
		{
			System.out.println("Maksimum sarjdasiniz!!!");
			System.out.println("Konumunuz: ("+x+","+y+")");
			batteryCapacity=5;
		}
		else
		{
			System.out.println("Araba sarj edildi!!!");
			batteryCapacity=5;
			kalanBataryaOmru();
			System.out.println("Konumunuz: ("+x+","+y+")");
		}

		
	}
	
}
