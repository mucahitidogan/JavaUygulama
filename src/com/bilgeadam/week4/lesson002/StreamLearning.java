package com.bilgeadam.week4.lesson002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);
        
        //foreach
//      for(Integer number : list)
//      {
//         System.out.println(number);
//      }
        //foreach
//        list.stream().forEach(number -> System.out.print(number));
//        list.stream().forEach(number ->
//        {
//        	System.out.print(number);
//        	System.out.println("Stream");
//        });
        
        //filter  **tekrar eden sayilari sadece bir kez yazdirir
//        list.stream()
//        .filter(number -> number>60)
//        .forEach(number -> System.out.println(number));
        
        //distinct **tekrar eden sayinin tekrar gelmemesi
//        list.stream()
//        .distinct()
//        .forEach(number -> System.out.println(number));
        
        //sorted sıralama
//        list.stream()
//        .sorted()
//        .forEach(number -> System.out.println(number));
        
        //sortedV2 tersten sıralama
//        list.stream()
//        .sorted(Comparator.reverseOrder())
//        .forEach(number -> System.out.println(number));
        
        //limit ilk 5 eleman
//        list.stream()
//        .limit(5)
//        .forEach(number -> System.out.println(number));
        
        //skip ilk 5 elemanı geç
//        list.stream()
//        .skip(5)
//        .limit(2)
//        .forEach(number -> System.out.println(number));
        
       //count
//        long count = list.stream()
//        .filter(number -> number<40)
//        .distinct()
//        .count();
//        System.out.println(count);
        
        //anyMatch **herhangi bir eşleşme durumunda true döner
//        boolean match = list.stream()
//        .anyMatch(number -> number<5);
//        System.out.println(match);
        
        //allMatch **listedeki bütün elemanların şartı sağlayıp sağlamadığını kontrol eder hepsi uyarsa true biri bile uymazsa false döner
//       boolean match2 = list.stream()
//        .allMatch(number -> number<5);
//        System.out.println(match2);
        
        //noneMatch **hiçbiririn sarta uymaması gerekir true döndürmesi gerekir burada number<2 dediğimizde listede 2den küçük sayi olmadiği için true dönecektir
//        boolean match3 = list.stream()
//                .noneMatch(number -> number<5);
//                System.out.println(match3);
        
        //map
//        list.stream()
//        .map(number -> number*2)
//        .forEach(number -> System.out.println(number));
        
  
        //map karekökünü aldık
        list.stream()
        .map(number -> Math.sqrt(number))
        .forEach(number -> System.out.println(number));
        
        
	}

}
