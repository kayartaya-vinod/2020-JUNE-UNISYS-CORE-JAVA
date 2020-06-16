package com.unisys.programs;
//pure function --> a function that is indenpendent of other functions in the
//class
//it takes 0 or more parameters and work on the same and may/may not return
//value
//typically (and most likely) they do not access member data of an object,
//hence they are also static
//Math.sqrt is an example (and all functions of java.lang.Math)

//functional interface --> an interface with exactly one single abstract method
//@FunctionalInterface (optional)

//lambda expressions a.k.a arrow functions can be used only when the function
//is a part of a functional interface (which has exactly 1 abstract method).
//The arrow function is equivalent of an object of a function interface with
//an implementation of the abstract method

//Shape s1 = new Shape() {
//public double calcualteArea() {
//	return 0;
//}
//};

//Shape s1 = public double calcualteArea() {
//	return 0;
//};

//Shape s1 = () -> {
//return 0;
//};

//Shape s1 = () -> 0;

@FunctionalInterface
interface Shape {

	double calcualteArea();

	default String info() {
		return "Shape";
	}

}

class Circle implements Shape {
	
	double radius;

	Circle() {}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcualteArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String info() {
		return "Circle";
	}
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(12.3);
		printArea(c1);
		// anonymous object
		printArea(() -> 100);
		
	}

	static void printArea(Shape s1) {
		System.out.printf("Area of %s is %f\n", s1.info(), s1.calcualteArea());
	}
}














