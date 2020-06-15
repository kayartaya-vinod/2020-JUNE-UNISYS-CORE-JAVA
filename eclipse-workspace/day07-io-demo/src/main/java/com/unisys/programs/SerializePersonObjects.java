package com.unisys.programs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.unisys.entity.Address;
import com.unisys.entity.Person;

public class SerializePersonObjects {

	public static void main(String[] args) throws IOException {
		
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person("John", "2000-02-01");
		p1.setAddress(new Address("1st cross 1st main ISRO layout", "Bangalore"));
		
		people.add(p1);
		
		System.out.println("p1 = " + p1);
		
		people.add(new Person("Martin", "1996-04-01"));
		people.add(new Person("Ramesh", "2004-03-02"));
		people.add(new Person("Harish", "2002-01-01"));
		people.add(new Person("Smith", "2001-12-01"));
		people.add(new Person("Ramesh", "1989-03-02"));
		people.add(new Person("Anand", "2002-01-01"));
		people.add(new Person("Harish", "2002-01-01"));
		
		FileOutputStream file = new FileOutputStream("people.data");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		for(Person p: people) {
			out.writeObject(p);
		}
		
		out.close();
		file.close();
		System.out.println("File people.data created in the project folder.");
	}

}
