package com.bilgeadam.week2.lesson004.arrays;

public class Arrays {

	public static void main(String[] args) {
		//1. yöntem
		double [] data;
		data = new double [10];
		//2. yöntem
		double[] data2 = new double[5];
		//3. yöntem
		int[] age = {12,4,5,6,7};
		//4. yöntem
		int [] age2 = new int[5];
		age2[0]=12;
		age2[1]=4;
		age2[2]=5;
		
		System.out.println("First element : "+age[0]);
		System.out.println("Second element : "+age[1]);
		System.out.println("Fifth element : "+age[4]);
		
		//loop through the array
		
		for(int i = 0; i < age.length; i++)
		{
			System.out.println(age[i]);
		}
		//foreach
		for(int i : age) {
			System.out.println(i);
		}
		
		//Arrays.toString
		System.out.println(java.util.Arrays.toString(age));
	}

}
