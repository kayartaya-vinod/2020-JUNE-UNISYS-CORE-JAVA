package com.unisys.programs;

import com.unisys.model.Student;

public class CreateStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.init(1122, "Rajesh", "rajesh@example.com",4.2);
		
		System.out.println(s1);
		s1.print();
		
	}

}
