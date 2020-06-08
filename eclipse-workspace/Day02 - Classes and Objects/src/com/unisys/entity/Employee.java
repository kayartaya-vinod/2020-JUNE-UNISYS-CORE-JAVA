package com.unisys.entity;

import lombok.Data;

@Data
public class Employee {

	private int id;
	private String name;
	private double salary;
	private ContactDetails contactDetails = new ContactDetails(); // HAS-A
	
}
