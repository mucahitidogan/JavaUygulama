package com.bilgeadam.week3.lesson001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AnimalListHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<>();
		
		animals.add("dog");
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("mouse");
		animals.add("elephant");
		animals.add("bird");
		animals.add("fish");
		animals.add("horse");
		animals.add("frog");
		
		System.out.println(animals.get(2));
		
		System.out.println(animals.remove(4)); //5. elemanı listeden kaldırır
		
		animals.set(5, "Platypus"); // 6. hayvanı değiştirip yerine bunu yazdırır
		
		for (String a : animals) // sırasıyla tüm indexleri gezip yazdırıyor lsitedeki tüm elemanları sırasıyla gezmeye yarıyor
		{
			System.out.println(a);
		}
		
		System.out.println(animals.size()); // listenin uzunluğunu kontrol etmek için // veri sayısı
		
		System.out.println(animals.isEmpty()); //listenin boş olup olmadığını true veya false olarak döndürür
		
		System.out.println(animals.contains("Dog")); // listede "Dog" diye bir değer var mı diye kontrol etmeye yarar true false döndürür
		
		
//		Scanner scan = new Scanner(System.in);  //kullanıcıdan alınan verinin listede olup olmadığını b/k harf girse de kontrolo eden kod
//		String input = scan.nextLine();
//		boolean answer = animals.contains(input.toLowerCase());
//		System.out.println(answer);

		
		int a = animals.indexOf("dog"); //Listede dog olup olmadığını kontrol edip  varsa 0 yoksa -1 değerini döndürür 
		System.out.println(a);		
				
		animals.set(1, "Giraffe");  
		for(String an : animals)
		{
			System.out.println(an);
		}
		
		List<String> animals2 = animals.subList(2, 6); //varolan listeden yeni liste oluşturma 
		for (String a2 : animals2)
		{
			System.out.println(a2);
		}
		
		Collections.reverse(animals); //listeyi son eleman dan ilk elemana doğru yazdırma tersten yazdırma
		for (String an : animals)
		{
			System.out.println(an);
		}
		
		Collections.sort(animals); //Listeyi alfabetik sıralama ile yazmamızı sağlar
		for(String an : animals)
		{
			System.out.println(an);
		}
		
		animals.clear(); //listedeki elemanların hepsini silmeye yarar
		for(String an : animals)
		{
			System.out.println(an);
		}
		
		
		
		
		
		
		
	}

}







