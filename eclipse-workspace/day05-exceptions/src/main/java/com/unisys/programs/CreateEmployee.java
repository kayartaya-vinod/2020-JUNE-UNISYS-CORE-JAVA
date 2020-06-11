package com.unisys.programs;

import com.unisys.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) throws Exception {
	
		Employee e1, e2;
		
		e1 = new Employee();
		e1.setId(7788);
		e1.setName("John");
		e1.setSalary(500);
		
		System.out.println(e1);
		
		
		e2 = new Employee(25, "", 45600);
		System.out.println(e2);
	}
}
