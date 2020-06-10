package com.unisys.entity;

// by implementing an interface, it is as if you are inheriting all abstract methods from an abstract class.
// which means, the Circle class already has ab abstract method called printArea(), because of which, 
// the class Circle must either be declared as abstract or override all the abstract methods.
public class Circle implements Shape {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void printArea() {
		System.out.printf("Area of circle with radius of %.1f units is %f sq.units\n", radius, PI * radius * radius);
	}

}
