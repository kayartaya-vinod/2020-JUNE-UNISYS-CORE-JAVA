package com.unisys.model;

import com.unisys.entity.Person;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Employee extends Person {
	private int id;
	private double salary = 56000;
	
	static {
		// used for initializing static (and usually final) member variables
		System.out.println("Employee class loaded into VM");
	}
	
	public Employee() {
		// super(); // implicitly done.
		System.out.println("Employee() called");
	}

	public Employee(int id, String name, String email, double salary) {
		// 1. super constructor call must be the first one here.
		// 2. super constructor can be invoked only from a constructor (not from any method)
		// 3. If you don't call super class constructor the default no-arg super class constructor is called
		super(name, email);
		this.id = id;
		this.salary = salary;
	}

	public Employee(int id, String name, String email) {
		super(name, email);
		this.id = id;
	}

	@Override
	public void print() {
		System.out.println("Id     = " + id);
		super.print();
		System.out.println("Salary = Rs." + salary);
		System.out.println();
	}

	

	

	
}
