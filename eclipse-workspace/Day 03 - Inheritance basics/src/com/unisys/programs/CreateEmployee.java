package com.unisys.programs;

import com.unisys.model.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		final Employee e1, e2, e3;
		
		
		e1 = new Employee();
		e2 = new Employee(1122, "Ramesh", "rames@xmpl.com", 65999);
		e3 = new Employee(1233, "Harish", "harish@xmpl.com");
		
		e1.print();
		e2.print();
		e3.print();
		
	}
	
	public static void main_old(String[] args) {
		
		
		System.out.println("Start of main");
		
		System.out.println("declaring e1...");
		Employee e1, e2;
		System.out.println("e1 declared!");
		System.out.println("create object for e1...");
		e1=new Employee();
		System.out.println("e1 got an object now.");
		
		System.out.println();
		System.out.println("create object for e2...");
		e2=new Employee();
		System.out.println("e2 got an object now.");
		System.out.println("End of main");
	}

}
