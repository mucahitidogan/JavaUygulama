package com.bilgeadam.week3.lesson001;

import java.util.ArrayList;
import java.util.List;

public class Liste1den100e {

	public static void main(String[] args) {
		
		List<Integer> tek = new ArrayList<>();
		List <Integer> cift = new ArrayList<>();
		
		for(int i = 1; i<=100; i++)
		{
			
			tek.add(i);
			i++;
			cift.add(i);
				
		}
		
		for(int i = 0; i<4; i++)
		{
			cift.remove(0);
		}
		
		for(Integer t : tek)
		{
			System.out.println(t);
		}
		
		for(Integer c : cift)
		{
			System.out.println(c);
		}
	}

}
