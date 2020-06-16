package com.unisys.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.unisys.entity.Gender;
import com.unisys.entity.Person;

//@FunctionalInterface
//interface A{
//	void f1();
//}
//
//@FunctionalInterface
//interface B extends A {
//	int f2(int x);
//	default void f1() {};
//}
//
//B b1 = x -> x*x;
//A a1 = () -> {};

public class MoreDemoOnLambda {


	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
			new Person("Vinod", "Bangalore", Gender.Male),
			new Person("Ramesh", "Chennai", Gender.Male),
			new Person("Ramya", "Bangalore", Gender.Female),
			new Person("Ankita", "Bangalore", Gender.Female),
			new Person("Harish", "Bangalore", Gender.Male),
			new Person("Anu", "Bangalore", Gender.Female),
			new Person("Rajesh", "Shimoga", Gender.Male),
			new Person("Mahesh", "Dallas", Gender.Male)
			);
		
		List<String> cities = new ArrayList<String>();
		for(Person p: people) {
			cities.add(p.getCity());
		}
		System.out.println("cities = " + cities);
		
		List<String> names = people.stream()
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		System.out.println("names = " + names);
		
		
		List<String> maleNames = people.stream()
				.filter(p -> p.getGender().equals(Gender.Male))
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		System.out.println("male names = " + maleNames);
		
		List<String> femaleNames = people.stream()
				.filter(p -> p.getGender().equals(Gender.Female))
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		System.out.println("female names = " + femaleNames);
		
		// people.stream().map(p->p.getName()).forEach(name->System.out.println(name));
		people.stream().map(p->p.getName()).forEach(System.out::println);
		// forEach --> a lambda function --> System.out.println
		// forEach --> System.out::println
	}
	
	
	
	public static void main_old(String[] args) {

		
		
		List<String> names = new ArrayList<String>();
		names.add("anupama suresh salunke");
		names.add("vinod kumar");
		names.add("vinay");
		names.add("arun");
		names.add("ajyea");
		names.add("shyam sundar kc");
		names.add("anil");
		
		System.out.println("Before sorting: " + names);
		Collections.sort(names);
		System.out.println("After sorting: " + names);
		
		/*
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		});
		*/
		
		// sorting based on length
		Collections.sort(names, (s1, s2) -> s2.length() - s1.length());
		System.out.println("After sorting by length: " + names);
		
	}
	
	
}
