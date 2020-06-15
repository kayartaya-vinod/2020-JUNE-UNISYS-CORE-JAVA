package com.unisys.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.unisys.entity.Person;

public class UseIterator {
	
	/*
	static void printSum(int... nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		System.out.println("Sum of inputs = " + sum);
	}

	public static void main(String[] args) {

		printSum(10, 20, 30, 40, 20, 12, 345, 67);
		printSum(334, 567);
	}
	*/
	
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("John", "2000-02-01"));
		people.add(new Person("Martin", "1996-04-01"));
		people.add(new Person("Ramesh", "2004-03-02"));
		people.add(new Person("Harish", "2002-01-01"));
		people.add(new Person("Smith", "2001-12-01"));
		people.add(new Person("Ramesh", "1989-03-02"));
		people.add(new Person("Anand", "2002-01-01"));
		people.add(new Person("Harish", "2002-01-01"));
		
		Comparator<Person> cmp = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int ret = p1.getDob().compareTo(p2.getDob());
				if(ret==0) {
					ret = p1.getName().compareTo(p2.getName());
				}
				return ret;
			}
		};
		
		Collections.sort(people, cmp);
		
		System.out.println("After sorting...");
		for(Person p: people) {
			System.out.println(p);
		}
		
	}
	
	public static void main_old_2(String[] args) {
		List<String> names = new ArrayList<String>();
		names.addAll(Arrays.asList("Vinod", "Shyam", "Kiran", "Kishore", "Harish", "Ramesh", "Rajesh"));
		names.add("Sandeep");
		System.out.println("Before sorting: " + names);
		
		Collections.sort(names); // mutates the names
		
		System.out.println("After sorting: " + names);
		
		
	}
	
	
	public static void main_old(String[] args) {
		
		List<String> names = Arrays.asList("Vinod", "Shyam", "Kiran", "Kishore");
		System.out.println(names.getClass());
		// names.add("Sandeep");
		names.set(2, "Sandeep");
		System.out.println(names);
		// names.remove(2);
		// names.remove("Sandeep");
		System.out.println(names);
		
		// pre jdk 1.5 (1.5 and above, you can just use the enhanced for loop (for-each loop))
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String elm = it.next();
			if(elm.equalsIgnoreCase("sandeep")) {
				it.remove();
			}
			System.out.println(elm);
		}
		
		
	}

}
