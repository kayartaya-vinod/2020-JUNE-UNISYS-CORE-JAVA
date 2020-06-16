package com.unisys.programs;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.unisys.entity.Gender;
import com.unisys.entity.Person;

public class EnumDemo {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.setName("Vinod");
		p1.setCity("Bangalore");
		p1.setGender(Gender.Male);

		Person p2 = new Person("Asha", "Shimoga", Gender.Female);

		System.out.println(p1);
		System.out.println(p2);
		
		// LVTI (dynamic datatype)
		var p3 = new Person("Ramesh", "Chennai", Gender.Male);
		System.out.println(p3);
		var s1 = "This is string!";
		System.out.println(s1);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Vinod");
		map.put("id", 1122);
		map.put("dt", new Date());
		
		
		var entries = map.entrySet();
		
		for(var entry: entries) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

	}
}
