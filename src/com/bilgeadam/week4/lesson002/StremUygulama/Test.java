package com.bilgeadam.week4.lesson002.StremUygulama;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> person = new ArrayList();
		person.add(new Person("Whittaker","Godleman","Male",32));
		person.add(new Person("Merola","Wrout","Female",32));
        person.add(new Person("Melosa","Courage","Female",14));
        person.add(new Person("Sydney","Cullington","Female",74));
        person.add(new Person("Sherwin","Ogley","Male",14));
        person.add(new Person("Dukie","Malpass","Male",30));
        person.add(new Person("Jarrett","Fearick","Male",77));
        person.add(new Person("Willie","Childerhouse","Male",31));
        person.add(new Person("Berky","Tollmache","Male",73));
        person.add(new Person("Nanete","Blunsden","Female",81));
		
        Map<String,Integer> filteredMap = person.stream()
       .filter(gencPerson -> gencPerson.age<50)
       .collect(Collectors.toMap(gencPerson -> gencPerson.name, gencPerson -> gencPerson.age));
        filteredMap.forEach((key,value) -> System.out.println(key +" "+value));		
        		
        List<Person> filteredPerson = person.stream()
        .filter(gencPerson -> gencPerson.age<35 && gencPerson.gender.equalsIgnoreCase("Male"))
        .collect(Collectors.toList());
        filteredPerson.forEach(Person :: speak);
        
        Set<Person> futureMalePerson = person.stream()
        .filter(gencPerson -> gencPerson.gender.equalsIgnoreCase("Male"))
		.map(gencPerson -> new Person(gencPerson.name,gencPerson.lastname,gencPerson.gender,gencPerson.age+15))
		.collect(Collectors.toSet());
		
		futureMalePerson.forEach(gencPerson -> System.out.println(gencPerson.age + " - " + gencPerson.name));
        
        
	}

}
