package com.unisys.entity;

@SuppressWarnings("unused")
public class Customer {
	private int id;	// only methods in this class can access using a reference
	String name;	// methods in this class and any other classes in the same package can access
	protected String email; // methods in this and subclass can access 
	public String city; // can be accessed anywhere
	
	
	// entity classes never contain main method
	// this is only for demo purpose
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.id =101;
		c1.name = "Scott";
		c1.email = "scott@example.com";
		c1.city = "Dallas";
	}
}
