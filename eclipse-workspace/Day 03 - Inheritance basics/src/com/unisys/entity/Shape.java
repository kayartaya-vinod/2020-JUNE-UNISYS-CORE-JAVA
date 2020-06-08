package com.unisys.entity;

public abstract class Shape {

	// 1. abstract methods do not have method body
	// 2. abstract methods can only exist in an abstract class
	// 3. abstract methods force the subclasses to implement/override them
	public abstract void printArea();
	
	// 1. final functions cannot be overridden in subclass
	public final void printInfo() {
		System.out.println("Class Shape, created by Vinod <vinod@vinod.co>");
	}
	
}
