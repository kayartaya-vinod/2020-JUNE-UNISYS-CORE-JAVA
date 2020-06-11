package com.unisys.programs;

import java.util.Set;
import java.util.TreeSet;

import com.unisys.entity.Person;

public class CreateSet {

	public static void main(String[] args) {
		
		Set<Person> friends = new TreeSet<Person>();
		Person p1 = new Person("Shyam", "1973-10-02");
		Person p2 = new Person("Shyam", "1973-10-02");
		// we need to override/implement hashCode() and equals(..) such that
		// two distinct objects with identical values share common hashCode value and are also equal
		
		friends.add(p1);
		friends.add(new Person("Vinay", "1973-11-12"));
		friends.add(new Person("Kiran", "1973-10-02"));
		friends.add(p2);
		friends.add(new Person("Shyam", "1973-10-02"));
		friends.add(new Person("Shyam", "2002-04-02"));
		friends.add(new Person("Arun", "1973-10-02"));
		
		System.out.println("p1.equals(p2) = " + p1.equals(p2));
		
		for (Person p : friends) {
			System.out.println(p);
		}
	}
	
	public static void main_old(String[] args) {
		
		Set<String> names = new TreeSet<String>();
		names.add("vinod");
		names.add("shyam");
		names.add("vinod");
		names.add("ramesh"); 
		names.add("vinay");
		names.add("vinod");
		names.add("arun");
		names.add("ajay");
		
		System.out.println(names);
		
	}
}
