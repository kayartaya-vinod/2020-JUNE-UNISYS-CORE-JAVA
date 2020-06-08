package com.unisys.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	protected String name;
	protected String email;

	static {
		System.out.println("Person class loaded into VM");
	}

	public Person() {
		System.out.println("Person() called");
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println("Name   = " + name);
		System.out.println("Email  = " + email);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}

}
