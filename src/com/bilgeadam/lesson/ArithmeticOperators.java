package com.bilgeadam.lesson;

public class ArithmeticOperators {

	public static void main(String[] args) {
	
		int x = 2;
		int y = 7;
		int toplam = x+y;
		int fark = y-x;
		double bolum = (double) y/ (double) x;
		int carpim = x*y;
		int mod=y%x;
		
		System.out.println("Toplam : " + toplam+"\nFark : "+fark+"\nÇarpım : "+ carpim+"\nBölüm : "+bolum+"\nMod : "+mod);

	}

}
