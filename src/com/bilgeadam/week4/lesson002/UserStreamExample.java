package com.bilgeadam.week4.lesson002;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserStreamExample {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		users.add(new User(1,"Aleyna"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yildiz"));
        users.add(new User(6,"Levent"));
        users.add(new User(7,"Elvan"));
	
//        users.stream().forEach(user -> 
//        {
//        System.out.println("Java8");
//        System.out.println(user);
//        });
//        
//        users.stream().forEach(user -> user.talk());
        //method reference
//        users.stream().forEach(User::talk);
        
        //user idsi 5ten büyük olanaları bulalım kaç adet olduğunu yazdıralım
//        long count = users.stream()
//        .filter(user -> user.id > 5)
//        .count();
//        System.out.println(count);
        
        List<User> filteredList = users.stream()
        .filter(user -> user.id > 5)
        .collect(Collectors.toList());
        
        filteredList.stream().forEach(user -> System.out.println(user));
        
        List<User> mappedList = users.stream().map(user -> new User(user.id+100,user.name))
        .collect(Collectors.toList());
        mappedList.stream().forEach(user -> System.out.println(user));
        
       Map<Integer,String> userMap = 
       users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
       userMap.forEach((key,value) -> System.out.println(key +" "+value));
	}

}
