package com.unisys.programs;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Hello, World!");
		
		String msg;
		msg = HelloWorld.greet("Vinod");
		System.out.println(msg);
		
		msg = greet("Shyam");
		System.out.println(msg);
		
	}
	
	// non-static functions can be invoked only using an object
	// static functions (members) do not belong to an object, they belong to a class
	static String greet(String name) {
		return String.format("Hello, %s!", name);
	}
	
}
