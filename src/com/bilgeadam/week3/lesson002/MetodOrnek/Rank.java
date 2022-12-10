package com.bilgeadam.week3.lesson002.MetodOrnek;

public class Rank {
	
	public String rankBelirle(double a) {
		
		String rank;
		
		if(a>=200.5)
		{
			//System.out.println("Rank A");
			rank = "Rank A";
			return rank;
		}
		else if(a>124.4)
		{
			//System.out.println("Rank B");
			rank = "Rank B";
			return rank;
		}
		else if(a<=124.4)
		{
			//System.out.println("Rank C");
			rank = "Rank C";
			return rank;
		}
		else
		{
			System.out.println("Yanlış bir değer girişi yaptınız!");
			
			return null;
		}
		
	}

}
