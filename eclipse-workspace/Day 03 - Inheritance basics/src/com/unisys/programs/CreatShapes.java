package com.unisys.programs;

import com.unisys.entity.Circle;
import com.unisys.entity.Shape;
import com.unisys.entity.Triangle;

public class CreatShapes {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		
		// c1.printArea();
		// t1.printArea();
		
		Shape s1;
		
		s1 = c1;
		s1.printArea();
		
		s1 = t1;
		s1.printArea();
		
	}

}
