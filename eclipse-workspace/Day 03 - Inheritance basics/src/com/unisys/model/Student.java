package com.unisys.model;

import com.unisys.entity.Person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Student extends Person {

	private int rollno;
	private double gpa;
	
	public void init(int rollno, String name, String email, double gpa) {
		this.rollno = rollno;
		this.gpa = gpa;
		// name and email have protected access,
		// so, we can access these only inside subclass functions
		this.name = name;
		this.email = email;
	}
	
	public void print() {
		System.out.println("Rollno = " + rollno);
		super.print();
		System.out.println("GPA    = " + gpa);
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno 
				+ ", gpa=" + gpa + ", " + super.toString() + "]";
	}

	
	
	
}
