package com.unisys.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.unisys.entity.Person;

public class CreateMap {

	public static void main(String[] args) {
		
		Map<String, Person> map= new HashMap<String, Person>();
		// for HashMap, LinkedHashMap and HashTable the key class must 
		// override the hashCode() and equals() methods
		map.put("vinod@vinod.co", new Person("Vinod Kumar", "1974-01-20"));
		map.put("shyam@example.com", new Person("Shyam Sundar", "1973-10-02"));
		map.put("kayartaya.vinod@gmail.com", new Person("Vinod Kumar", "1974-01-20"));
		map.put("vinod@vinod.co", new Person("Vinod Kumar", "1974-01-20"));
		
		// collection of all the keys:
		Set<String> keys = map.keySet();
		System.out.println("collection of all the keys:");
		for(String key: keys) {
			System.out.println(key);
		}
		System.out.println();
		
		// collection of values
		System.out.println("collection of values: ");
		Collection<Person> people = map.values();
		for(Person p: people) {
			System.out.println(p);
		}
		System.out.println();
		
		// collection of Entry objects, with key/value pair
		Set<Entry<String, Person>> entries = map.entrySet();
		System.out.println("collection of Entry objects, with key/value pair: ");
		for(Entry<String, Person> entry: entries) {
			String key = entry.getKey();
			Person value = entry.getValue();
			
			System.out.println("Key = " + key + ", value = " + value);
		}
		System.out.println();
		
		String email = "shyam@example.com";
		
		if(map.containsKey(email)) {
			Person p1 = map.get(email);
			System.out.println("Person with email '" + email + "' is " + p1);
		}
		else {
			System.out.println("No data found for email: " + email);
		}
	}
}










