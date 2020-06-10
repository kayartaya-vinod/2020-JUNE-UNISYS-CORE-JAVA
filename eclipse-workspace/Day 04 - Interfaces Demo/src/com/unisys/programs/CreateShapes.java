package com.unisys.programs;

import com.unisys.entity.Circle;
import com.unisys.entity.Shape;
import com.unisys.entity.Triangle;

public class CreateShapes {

	public static void main(String[] args) {

		// interface can be used for creating a variable (reference)
		Shape s1;
		
		// cannot instantiate an interface. An object of an interface
		// can be REALIZED using a class that implements the interface
		// s1 = new Shape();
		
		s1 = new Circle(12.34);
		s1.printArea(); // compiler verifies that s1's data type Shape has a function called printArea()
		// but, at the runtime, JVM finds an instanceof Circle using the reference of s1, and invokes the function
		// on the circle object.
		
		s1 = new Triangle();
		s1.printArea();
		
	}

}
