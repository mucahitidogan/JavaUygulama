package com.bilgeadam.week5.Lesson004;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> sayilar = new ArrayList<>();
        sayilar.add(15);
        sayilar.add(13);
        sayilar.add(20);
        sayilar.add(72);
        sayilar.add(91);
		
        
        List<Integer> kalansizBolunenler = sayilar.stream().filter(number -> number % 5 == 0).collect(Collectors.toList());
        System.out.println(kalansizBolunenler);
        
        Long kacTane = sayilar.stream().filter(number -> number % 5 == 0).count();
        System.out.println("5e bölünen sayiların adeti : " + kacTane);
        
        List<Integer> kareleri1 = new ArrayList<>();
        sayilar.stream().forEach(number -> kareleri1.add(number * number));
        System.out.println(kareleri1);
        
        List<Integer> kareleri2 = sayilar.stream().map(number -> number*number).collect(Collectors.toList());
        
	}

}
