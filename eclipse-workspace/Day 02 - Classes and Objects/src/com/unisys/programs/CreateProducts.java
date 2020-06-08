package com.unisys.programs;

import com.unisys.entity.Product;

public class CreateProducts {

	public static void main(String[] args) {

		Product p1;

		p1 = new Product();

		System.out.println(p1);
		System.out.println("p1.id is " + p1.getId());
		System.out.println("p1.name is " + p1.getName());
		System.out.println("p1.price is " + p1.getPrice());
		System.out.println();

		p1.setId(101);
		p1.setName("iPad 4th gen");
		p1.setPrice(38000.0);

		System.out.println("p1.id is " + p1.getId());
		System.out.println("p1.name is " + p1.getName());
		System.out.println("p1.price is " + p1.getPrice());
		System.out.println();

		System.out.println(p1);

		p1 = new Product(109, "Macbook Pro", 108000);
		
		System.out.println("p1.id is " + p1.getId());
		System.out.println("p1.name is " + p1.getName());
		System.out.println("p1.price is " + p1.getPrice());
		System.out.println();

		// inside PrintStream class, the println receives an reference of Object
		// so, it's like Object x = p1;  // this ok --> up-casting is implicit
		System.out.println(p1);

	}
}
