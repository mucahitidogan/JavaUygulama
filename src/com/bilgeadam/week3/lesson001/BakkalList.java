package com.bilgeadam.week3.lesson001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cart = new ArrayList<>();
		List<String> menu = new ArrayList<>();
		menu.add("Cips");
		menu.add("Kola");
		menu.add("Seker");
		menu.add("Cay");
		menu.add("Biskuvi");
		menu.add("Cikolata");
		menu.add("Gofret");
		menu.add("Sakiz");
		menu.add("Su");
		menu.add("Soda");
		
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("-------------------------------------------------"+"\n1 - Show Products"+"\n2 - Add product to Cart"+"\n3 - Show Cart"+"\n4 - Exit"+"\n-------------------------------------------------"+"\nPlease choose what you want to do?");
			int input = scan.nextInt();
			
			switch (input) 
			{
				case 1: 
					int i = 1;
					for (String m : menu)
					{
						System.out.println(i+" - "+m);
						i++;
					}
					break;
				
				case 2:
					int input2 = scan.nextInt();
					cart.add(menu.get(input2-1));
					System.out.println(menu.get(input2-1)+" added to your Cart");
					break;
				
				case 3:
					for(String c : cart)
					{
						System.out.println("Products in Cart"+"\n-------------------------------------");
						System.out.println(c);
					}
					break;
				case 4: 
					System.exit(0);
			    default:
			    	break;
			}
		
		}	

	}

}
